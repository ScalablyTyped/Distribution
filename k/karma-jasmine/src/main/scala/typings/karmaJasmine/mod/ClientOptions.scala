package typings.karmaJasmine.mod

import typings.karmaJasmine.anon.EnvConfigurationtimeoutIn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientOptions extends js.Object {
  
  var jasmine: js.UndefOr[EnvConfigurationtimeoutIn] = js.native
  
  /**
    * run a subset of the full set of specs.
    * Complete sharding support needs to be done in the process that calls karma,
    * and would need to support test result integration across shards.
    * See {@link https://github.com/karma-runner/karma-jasmine#sharding}
    *
    */
  var shardIndex: js.UndefOr[Double] = js.native
  
  /**
    * run a subset of the full set of specs.
    * Complete sharding support needs to be done in the process that calls karma,
    * and would need to support test result integration across shards.
    * See {@link https://github.com/karma-runner/karma-jasmine#sharding}
    */
  var totalShards: js.UndefOr[Double] = js.native
}
object ClientOptions {
  
  @scala.inline
  def apply(): ClientOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientOptions]
  }
  
  @scala.inline
  implicit class ClientOptionsOps[Self <: ClientOptions] (val x: Self) extends AnyVal {
    
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
    def setJasmine(value: EnvConfigurationtimeoutIn): Self = this.set("jasmine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJasmine: Self = this.set("jasmine", js.undefined)
    
    @scala.inline
    def setShardIndex(value: Double): Self = this.set("shardIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShardIndex: Self = this.set("shardIndex", js.undefined)
    
    @scala.inline
    def setTotalShards(value: Double): Self = this.set("totalShards", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalShards: Self = this.set("totalShards", js.undefined)
  }
}
