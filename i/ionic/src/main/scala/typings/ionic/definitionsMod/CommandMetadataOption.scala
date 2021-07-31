package typings.ionic.definitionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommandMetadataOption
  extends StObject
     with typings.ionicCliFramework.definitionsMod.CommandMetadataOption {
  
  var hint: js.UndefOr[String] = js.undefined
  
  var `private`: js.UndefOr[Boolean] = js.undefined
}
object CommandMetadataOption {
  
  @scala.inline
  def apply(name: String, summary: String): CommandMetadataOption = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandMetadataOption]
  }
  
  @scala.inline
  implicit class CommandMetadataOptionMutableBuilder[Self <: CommandMetadataOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHint(value: String): Self = StObject.set(x, "hint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHintUndefined: Self = StObject.set(x, "hint", js.undefined)
    
    @scala.inline
    def setPrivate(value: Boolean): Self = StObject.set(x, "private", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateUndefined: Self = StObject.set(x, "private", js.undefined)
  }
}
