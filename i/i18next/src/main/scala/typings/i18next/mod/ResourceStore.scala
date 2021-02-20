package typings.i18next.mod

import typings.i18next.i18nextStrings.added
import typings.i18next.i18nextStrings.removed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("i18next", "ResourceStore")
@js.native
class ResourceStore protected () extends StObject {
  def this(data: Resource, options: InitOptions) = this()
  
  var data: Resource = js.native
  
  /**
    * Remove event listener
    * removes all callback when callback not specified
    */
  @JSName("off")
  def off_added(event: added): Unit = js.native
  @JSName("off")
  def off_added(event: added, callback: js.Function2[/* lng */ String, /* ns */ String, Unit]): Unit = js.native
  @JSName("off")
  def off_removed(event: removed): Unit = js.native
  @JSName("off")
  def off_removed(event: removed, callback: js.Function2[/* lng */ String, /* ns */ String, Unit]): Unit = js.native
  
  /**
    * Gets fired when resources got added or removed
    */
  @JSName("on")
  def on_added(event: added, callback: js.Function2[/* lng */ String, /* ns */ String, Unit]): Unit = js.native
  @JSName("on")
  def on_removed(event: removed, callback: js.Function2[/* lng */ String, /* ns */ String, Unit]): Unit = js.native
  
  var options: InitOptions = js.native
}
