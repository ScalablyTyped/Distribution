package typings.ionic.definitionsMod

import typings.node.childProcessMod.SpawnOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IShellSpawnOptions
  extends StObject
     with SpawnOptions {
  
  var showCommand: js.UndefOr[Boolean] = js.undefined
}
object IShellSpawnOptions {
  
  @scala.inline
  def apply(): IShellSpawnOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IShellSpawnOptions]
  }
  
  @scala.inline
  implicit class IShellSpawnOptionsMutableBuilder[Self <: IShellSpawnOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setShowCommand(value: Boolean): Self = StObject.set(x, "showCommand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowCommandUndefined: Self = StObject.set(x, "showCommand", js.undefined)
  }
}
