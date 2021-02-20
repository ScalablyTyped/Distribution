package typings.jpm

import typings.jpm.jpmStrings.OverQuota
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Lets an add-on store data so that it's retained across Firefox restarts
  */
object simpleStorageMod {
  
  @JSImport("sdk/simple-storage", "on")
  @js.native
  def on_OverQuota(event: OverQuota, handler: js.Function0[_]): Unit = js.native
  
  @JSImport("sdk/simple-storage", "quotaUsage")
  @js.native
  val quotaUsage: Double = js.native
  
  @JSImport("sdk/simple-storage", "storage")
  @js.native
  val storage: js.Any = js.native
}
