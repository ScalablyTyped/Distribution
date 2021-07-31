package typings.ionic.anon

import typings.ionic.npmMod.PkgManagerCommand
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<ionic.ionic/lib/utils/npm.PkgManagerOptions> */
trait PartialPkgManagerOptions extends StObject {
  
  var command: js.UndefOr[PkgManagerCommand] = js.undefined
  
  var global: js.UndefOr[Boolean] = js.undefined
  
  var json: js.UndefOr[Boolean] = js.undefined
  
  var pkg: js.UndefOr[String] = js.undefined
  
  var save: js.UndefOr[Boolean] = js.undefined
  
  var saveDev: js.UndefOr[Boolean] = js.undefined
  
  var saveExact: js.UndefOr[Boolean] = js.undefined
  
  var script: js.UndefOr[String] = js.undefined
  
  var scriptArgs: js.UndefOr[js.Array[String]] = js.undefined
}
object PartialPkgManagerOptions {
  
  @scala.inline
  def apply(): PartialPkgManagerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPkgManagerOptions]
  }
  
  @scala.inline
  implicit class PartialPkgManagerOptionsMutableBuilder[Self <: PartialPkgManagerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommand(value: PkgManagerCommand): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommandUndefined: Self = StObject.set(x, "command", js.undefined)
    
    @scala.inline
    def setGlobal(value: Boolean): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalUndefined: Self = StObject.set(x, "global", js.undefined)
    
    @scala.inline
    def setJson(value: Boolean): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
    
    @scala.inline
    def setPkg(value: String): Self = StObject.set(x, "pkg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPkgUndefined: Self = StObject.set(x, "pkg", js.undefined)
    
    @scala.inline
    def setSave(value: Boolean): Self = StObject.set(x, "save", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSaveDev(value: Boolean): Self = StObject.set(x, "saveDev", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSaveDevUndefined: Self = StObject.set(x, "saveDev", js.undefined)
    
    @scala.inline
    def setSaveExact(value: Boolean): Self = StObject.set(x, "saveExact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSaveExactUndefined: Self = StObject.set(x, "saveExact", js.undefined)
    
    @scala.inline
    def setSaveUndefined: Self = StObject.set(x, "save", js.undefined)
    
    @scala.inline
    def setScript(value: String): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScriptArgs(value: js.Array[String]): Self = StObject.set(x, "scriptArgs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScriptArgsUndefined: Self = StObject.set(x, "scriptArgs", js.undefined)
    
    @scala.inline
    def setScriptArgsVarargs(value: String*): Self = StObject.set(x, "scriptArgs", js.Array(value :_*))
    
    @scala.inline
    def setScriptUndefined: Self = StObject.set(x, "script", js.undefined)
  }
}
