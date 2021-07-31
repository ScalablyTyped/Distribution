package typings.materialTabScroller

import typings.std.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilMod {
  
  @JSImport("@material/tab-scroller/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def computeHorizontalScrollbarHeight(documentObj: Document): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("computeHorizontalScrollbarHeight")(documentObj.asInstanceOf[js.Any]).asInstanceOf[Double]
  @scala.inline
  def computeHorizontalScrollbarHeight(documentObj: Document, shouldCacheResult: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("computeHorizontalScrollbarHeight")(documentObj.asInstanceOf[js.Any], shouldCacheResult.asInstanceOf[js.Any])).asInstanceOf[Double]
}
