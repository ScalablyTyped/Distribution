package typings.listr2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Renderer options for the parent Listr class, including setup for selecting default and fallback renderers.  */
trait ListrRendererOptions[Renderer /* <: ListrRendererValue */, FallbackRenderer /* <: ListrRendererValue */]
  extends StObject
     with ListrPrimaryRendererOptions[Renderer]
     with ListrSecondaryRendererOptions[FallbackRenderer]
object ListrRendererOptions {
  
  inline def apply[Renderer /* <: ListrRendererValue */, FallbackRenderer /* <: ListrRendererValue */](): ListrRendererOptions[Renderer, FallbackRenderer] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListrRendererOptions[Renderer, FallbackRenderer]]
  }
}
