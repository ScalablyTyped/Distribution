package typings.levelTtl.mod

import typings.abstractLeveldown.mod.AbstractIterator
import typings.abstractLeveldown.mod.AbstractLevelDOWN
import typings.levelup.mod.LevelUp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LevelTTLOptions extends js.Object {
  
  /**
    * A number specifying the frequency of internal scans for checking for expired keys.
    * @default 10000
    */
  var checkFrequency: js.UndefOr[Double] = js.native
  
  /**
    * A number specifying the default time-to-live for new or updated values.
    * This can be overridden by explicitly setting the ttl value.
    * @default 0
    */
  var defaultTTL: js.UndefOr[Double] = js.native
  
  /**
    * Character specifying the key namespace for expiration values.
    * @default 'x'
    */
  var expiryNamespace: js.UndefOr[String] = js.native
  
  /**
    * A string for prefixing the modified database methods (i.e., put, del, batch, ttl, stop).
    */
  var methodPrefix: js.UndefOr[String] = js.native
  
  /**
    * Character specifying the key namespace for ttl values.
    * @default 'ttl'
    */
  var namespace: js.UndefOr[String] = js.native
  
  /**
    * Character for separating sublevel prefixes from user keys and each other. Should be outside the character (or byte) range of user keys.
    * @default ''
    */
  var separator: js.UndefOr[String] = js.native
  
  /**
    * A custom storage database for the meta data.
    * If it's set, that storage will contain all the ttl meta data.
    * A use case for this would be to avoid mixing data and meta data in the same keyspace, since if it's not set, all data will be sharing the same keyspace.
    */
  var sub: js.UndefOr[LevelUp[AbstractLevelDOWN[_, _], AbstractIterator[_, _]]] = js.native
}
object LevelTTLOptions {
  
  @scala.inline
  def apply(): LevelTTLOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LevelTTLOptions]
  }
  
  @scala.inline
  implicit class LevelTTLOptionsOps[Self <: LevelTTLOptions] (val x: Self) extends AnyVal {
    
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
    def setCheckFrequency(value: Double): Self = this.set("checkFrequency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheckFrequency: Self = this.set("checkFrequency", js.undefined)
    
    @scala.inline
    def setDefaultTTL(value: Double): Self = this.set("defaultTTL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultTTL: Self = this.set("defaultTTL", js.undefined)
    
    @scala.inline
    def setExpiryNamespace(value: String): Self = this.set("expiryNamespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpiryNamespace: Self = this.set("expiryNamespace", js.undefined)
    
    @scala.inline
    def setMethodPrefix(value: String): Self = this.set("methodPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMethodPrefix: Self = this.set("methodPrefix", js.undefined)
    
    @scala.inline
    def setNamespace(value: String): Self = this.set("namespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNamespace: Self = this.set("namespace", js.undefined)
    
    @scala.inline
    def setSeparator(value: String): Self = this.set("separator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeparator: Self = this.set("separator", js.undefined)
    
    @scala.inline
    def setSub(value: LevelUp[AbstractLevelDOWN[_, _], AbstractIterator[_, _]]): Self = this.set("sub", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSub: Self = this.set("sub", js.undefined)
  }
}
