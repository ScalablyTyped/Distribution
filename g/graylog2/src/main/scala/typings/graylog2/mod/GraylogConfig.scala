package typings.graylog2.mod

import typings.graylog2.anon.Readonlyhoststringportnum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GraylogConfig extends js.Object {
  
  /**
    * The max UDP packet size. Should never exceed the MTU of your system.
    * The default value is 1400
    */
  var bufferSize: js.UndefOr[Double] = js.native
  
  /**
    * The strategy for a message compression:
    *  "always"  -  every message will be compressed with zlib.deflate
    *  "never"   -  no compression
    *  "optimal" -  messages bigger than GraylogConfig.bufferSize will be compressed
    *
    *  The default value is "optimal"
    */
  var deflate: js.UndefOr[GraylogDeflate] = js.native
  
  /**
    * The facility - log's field type in Graylog.
    * The default value is "Node.js"
    */
  var facility: js.UndefOr[String] = js.native
  
  /**
    * The name of a host.
    * The default value is "os.hostname()"
    */
  var hostname: js.UndefOr[String] = js.native
  
  /**
    * The list of graylog servers
    */
  var servers: js.Array[Readonlyhoststringportnum] = js.native
}
object GraylogConfig {
  
  @scala.inline
  def apply(servers: js.Array[Readonlyhoststringportnum]): GraylogConfig = {
    val __obj = js.Dynamic.literal(servers = servers.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraylogConfig]
  }
  
  @scala.inline
  implicit class GraylogConfigOps[Self <: GraylogConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setServersVarargs(value: Readonlyhoststringportnum*): Self = this.set("servers", js.Array(value :_*))
    
    @scala.inline
    def setServers(value: js.Array[Readonlyhoststringportnum]): Self = this.set("servers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBufferSize(value: Double): Self = this.set("bufferSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBufferSize: Self = this.set("bufferSize", js.undefined)
    
    @scala.inline
    def setDeflate(value: GraylogDeflate): Self = this.set("deflate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeflate: Self = this.set("deflate", js.undefined)
    
    @scala.inline
    def setFacility(value: String): Self = this.set("facility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFacility: Self = this.set("facility", js.undefined)
    
    @scala.inline
    def setHostname(value: String): Self = this.set("hostname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHostname: Self = this.set("hostname", js.undefined)
  }
}
