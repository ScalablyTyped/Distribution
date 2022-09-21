package typings.imgDiffJs

import typings.imgDiffJs.typesMod.Decorder
import typings.imgDiffJs.typesMod.ImgDiffOptions
import typings.imgDiffJs.typesMod.ImgDiffResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("img-diff-js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def imgDiff(opt: ImgDiffOptions): js.Promise[ImgDiffResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("imgDiff")(opt.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ImgDiffResult]]
  
  inline def registerDecoder(extensions: js.Array[String], decoder: Decorder): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerDecoder")(extensions.asInstanceOf[js.Any], decoder.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
