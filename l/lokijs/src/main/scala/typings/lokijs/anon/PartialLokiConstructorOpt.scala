package typings.lokijs.anon

import typings.lokijs.LokiPersistenceAdapter
import typings.lokijs.lokijsStrings.BROWSER
import typings.lokijs.lokijsStrings.CORDOVA
import typings.lokijs.lokijsStrings.NA
import typings.lokijs.lokijsStrings.NATIVESCRIPT
import typings.lokijs.lokijsStrings.NODEJS
import typings.lokijs.lokijsStrings.destructured
import typings.lokijs.lokijsStrings.fs
import typings.lokijs.lokijsStrings.localStorage
import typings.lokijs.lokijsStrings.memory
import typings.lokijs.lokijsStrings.normal
import typings.lokijs.lokijsStrings.pretty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<lokijs.LokiConstructorOptions> & std.Partial<lokijs.LokiConfigOptions> & std.Partial<lokijs.ThrottledSaveDrainOptions> */
@js.native
trait PartialLokiConstructorOpt extends js.Object {
  
  var adapter: js.UndefOr[LokiPersistenceAdapter | Null] = js.native
  
  var autoload: js.UndefOr[Boolean] = js.native
  
  var autoloadCallback: js.UndefOr[js.Function1[/* err */ js.Any, Unit]] = js.native
  
  var autosave: js.UndefOr[Boolean] = js.native
  
  var autosaveCallback: js.UndefOr[js.Function1[/* err */ js.UndefOr[js.Any], Unit]] = js.native
  
  var autosaveInterval: js.UndefOr[String | Double] = js.native
  
  var destructureDelimiter: js.UndefOr[String] = js.native
  
  var env: js.UndefOr[NATIVESCRIPT | NODEJS | CORDOVA | BROWSER | NA] = js.native
  
  var persistenceMethod: js.UndefOr[fs | localStorage | memory | Null] = js.native
  
  var recursiveWait: js.UndefOr[Boolean] = js.native
  
  var recursiveWaitLimit: js.UndefOr[Boolean] = js.native
  
  var recursiveWaitLimitDuration: js.UndefOr[Double] = js.native
  
  var serializationMethod: js.UndefOr[normal | pretty | destructured | Null] = js.native
  
  var started: js.UndefOr[Double] = js.native
  
  var throttledSaves: js.UndefOr[Boolean] = js.native
  
  var verbose: js.UndefOr[Boolean] = js.native
}
object PartialLokiConstructorOpt {
  
  @scala.inline
  def apply(): PartialLokiConstructorOpt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialLokiConstructorOpt]
  }
  
  @scala.inline
  implicit class PartialLokiConstructorOptOps[Self <: PartialLokiConstructorOpt] (val x: Self) extends AnyVal {
    
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
    def setAdapter(value: LokiPersistenceAdapter): Self = this.set("adapter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdapter: Self = this.set("adapter", js.undefined)
    
    @scala.inline
    def setAdapterNull: Self = this.set("adapter", null)
    
    @scala.inline
    def setAutoload(value: Boolean): Self = this.set("autoload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoload: Self = this.set("autoload", js.undefined)
    
    @scala.inline
    def setAutoloadCallback(value: /* err */ js.Any => Unit): Self = this.set("autoloadCallback", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteAutoloadCallback: Self = this.set("autoloadCallback", js.undefined)
    
    @scala.inline
    def setAutosave(value: Boolean): Self = this.set("autosave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutosave: Self = this.set("autosave", js.undefined)
    
    @scala.inline
    def setAutosaveCallback(value: /* err */ js.UndefOr[js.Any] => Unit): Self = this.set("autosaveCallback", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteAutosaveCallback: Self = this.set("autosaveCallback", js.undefined)
    
    @scala.inline
    def setAutosaveInterval(value: String | Double): Self = this.set("autosaveInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutosaveInterval: Self = this.set("autosaveInterval", js.undefined)
    
    @scala.inline
    def setDestructureDelimiter(value: String): Self = this.set("destructureDelimiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestructureDelimiter: Self = this.set("destructureDelimiter", js.undefined)
    
    @scala.inline
    def setEnv(value: NATIVESCRIPT | NODEJS | CORDOVA | BROWSER | NA): Self = this.set("env", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnv: Self = this.set("env", js.undefined)
    
    @scala.inline
    def setPersistenceMethod(value: fs | localStorage | memory): Self = this.set("persistenceMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePersistenceMethod: Self = this.set("persistenceMethod", js.undefined)
    
    @scala.inline
    def setPersistenceMethodNull: Self = this.set("persistenceMethod", null)
    
    @scala.inline
    def setRecursiveWait(value: Boolean): Self = this.set("recursiveWait", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecursiveWait: Self = this.set("recursiveWait", js.undefined)
    
    @scala.inline
    def setRecursiveWaitLimit(value: Boolean): Self = this.set("recursiveWaitLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecursiveWaitLimit: Self = this.set("recursiveWaitLimit", js.undefined)
    
    @scala.inline
    def setRecursiveWaitLimitDuration(value: Double): Self = this.set("recursiveWaitLimitDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecursiveWaitLimitDuration: Self = this.set("recursiveWaitLimitDuration", js.undefined)
    
    @scala.inline
    def setSerializationMethod(value: normal | pretty | destructured): Self = this.set("serializationMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSerializationMethod: Self = this.set("serializationMethod", js.undefined)
    
    @scala.inline
    def setSerializationMethodNull: Self = this.set("serializationMethod", null)
    
    @scala.inline
    def setStarted(value: Double): Self = this.set("started", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStarted: Self = this.set("started", js.undefined)
    
    @scala.inline
    def setThrottledSaves(value: Boolean): Self = this.set("throttledSaves", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThrottledSaves: Self = this.set("throttledSaves", js.undefined)
    
    @scala.inline
    def setVerbose(value: Boolean): Self = this.set("verbose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerbose: Self = this.set("verbose", js.undefined)
  }
}
