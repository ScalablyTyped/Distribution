package typings.iobroker.objectsMod.global.ioBroker

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OtherCommon
  extends ObjectCommon
     with /* propName */ StringDictionary[js.Any] {
  
  // Make it possible to narrow the object type using the custom property
  var custom: js.UndefOr[scala.Nothing] = js.native
}
object OtherCommon {
  
  @scala.inline
  def apply(name: StringOrTranslated): OtherCommon = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[OtherCommon]
  }
}
