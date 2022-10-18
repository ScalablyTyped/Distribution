package typings.jpm

import typings.jpm.jpmStrings.downgrade
import typings.jpm.jpmStrings.enable
import typings.jpm.jpmStrings.install
import typings.jpm.jpmStrings.startup
import typings.jpm.jpmStrings.upgrade
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Access data that is bundled with the add-on, and add-on metadata
  */
object sdkSelfMod {
  
  object data {
    
    @JSImport("sdk/self", "data")
    @js.native
    val ^ : js.Any = js.native
    
    inline def load(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def url(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("url")(name.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  @JSImport("sdk/self", "id")
  @js.native
  val id: String = js.native
  
  @JSImport("sdk/self", "isPrivateBrowsingSupported")
  @js.native
  val isPrivateBrowsingSupported: Boolean = js.native
  
  @JSImport("sdk/self", "loadReason")
  @js.native
  val loadReason: install | enable | startup | upgrade | downgrade = js.native
  
  @JSImport("sdk/self", "name")
  @js.native
  val name: String = js.native
  
  @JSImport("sdk/self", "uri")
  @js.native
  val uri: String = js.native
  
  @JSImport("sdk/self", "version")
  @js.native
  val version: String = js.native
}
