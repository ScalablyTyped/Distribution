package typings.listr2.mod

import typings.listr2.anon.Enquirer
import typings.listr2.listr2Booleans.`false`
import typings.listr2.listr2Strings.full
import typings.listr2.listr2Strings.minimal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Subtasks has reduced set options where the missing ones are explicitly set by the base class.
  */
/* Inlined parent std.Omit<listr2.listr2.ListrOptions<Ctx>, 'registerSignalListeners' | 'fallbackRendererCondition' | 'silentRendererCondition' | 'disableColor' | 'forceColor' | 'forceTTY' | 'forceUnicode'> */
/* Inlined parent std.Omit<listr2.listr2.ListrPrimaryRendererOptions<Renderer>, 'renderer'> */
trait ListrSubClassOptions[Ctx, Renderer /* <: ListrRendererValue */] extends StObject {
  
  var collectErrors: js.UndefOr[`false` | minimal | full] = js.undefined
  
  var concurrent: js.UndefOr[Boolean | Double] = js.undefined
  
  var ctx: js.UndefOr[Ctx] = js.undefined
  
  var exitAfterRollback: js.UndefOr[Boolean] = js.undefined
  
  var exitOnError: js.UndefOr[Boolean] = js.undefined
  
  var injectWrapper: js.UndefOr[Enquirer] = js.undefined
  
  var rendererOptions: js.UndefOr[ListrGetRendererOptions[Renderer]] = js.undefined
}
object ListrSubClassOptions {
  
  inline def apply[Ctx, Renderer /* <: ListrRendererValue */](): ListrSubClassOptions[Ctx, Renderer] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListrSubClassOptions[Ctx, Renderer]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListrSubClassOptions[?, ?], Ctx, Renderer /* <: ListrRendererValue */] (val x: Self & (ListrSubClassOptions[Ctx, Renderer])) extends AnyVal {
    
    inline def setCollectErrors(value: `false` | minimal | full): Self = StObject.set(x, "collectErrors", value.asInstanceOf[js.Any])
    
    inline def setCollectErrorsUndefined: Self = StObject.set(x, "collectErrors", js.undefined)
    
    inline def setConcurrent(value: Boolean | Double): Self = StObject.set(x, "concurrent", value.asInstanceOf[js.Any])
    
    inline def setConcurrentUndefined: Self = StObject.set(x, "concurrent", js.undefined)
    
    inline def setCtx(value: Ctx): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
    
    inline def setCtxUndefined: Self = StObject.set(x, "ctx", js.undefined)
    
    inline def setExitAfterRollback(value: Boolean): Self = StObject.set(x, "exitAfterRollback", value.asInstanceOf[js.Any])
    
    inline def setExitAfterRollbackUndefined: Self = StObject.set(x, "exitAfterRollback", js.undefined)
    
    inline def setExitOnError(value: Boolean): Self = StObject.set(x, "exitOnError", value.asInstanceOf[js.Any])
    
    inline def setExitOnErrorUndefined: Self = StObject.set(x, "exitOnError", js.undefined)
    
    inline def setInjectWrapper(value: Enquirer): Self = StObject.set(x, "injectWrapper", value.asInstanceOf[js.Any])
    
    inline def setInjectWrapperUndefined: Self = StObject.set(x, "injectWrapper", js.undefined)
    
    inline def setRendererOptions(value: ListrGetRendererOptions[Renderer]): Self = StObject.set(x, "rendererOptions", value.asInstanceOf[js.Any])
    
    inline def setRendererOptionsUndefined: Self = StObject.set(x, "rendererOptions", js.undefined)
  }
}
