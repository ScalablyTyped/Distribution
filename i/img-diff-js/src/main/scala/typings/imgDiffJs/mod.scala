package typings.imgDiffJs

import typings.imgDiffJs.anon.IncludeAA
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("img-diff-js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def imgDiff(opt: ImgDiffOptions): js.Promise[ImgDiffResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("imgDiff")(opt.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ImgDiffResult]]
  
  @scala.inline
  def registerDecoder(extensions: js.Array[String], decoder: js.Function1[/* filename */ String, js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerDecoder")(extensions.asInstanceOf[js.Any], decoder.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait ImgDiffOptions extends StObject {
    
    var actualFilename: String
    
    var diffFilename: js.UndefOr[String] = js.undefined
    
    var expectedFilename: String
    
    /** {default:false} */
    var generateOnlyDiffFile: js.UndefOr[Boolean] = js.undefined
    
    var options: js.UndefOr[IncludeAA] = js.undefined
  }
  object ImgDiffOptions {
    
    @scala.inline
    def apply(actualFilename: String, expectedFilename: String): ImgDiffOptions = {
      val __obj = js.Dynamic.literal(actualFilename = actualFilename.asInstanceOf[js.Any], expectedFilename = expectedFilename.asInstanceOf[js.Any])
      __obj.asInstanceOf[ImgDiffOptions]
    }
    
    @scala.inline
    implicit class ImgDiffOptionsMutableBuilder[Self <: ImgDiffOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActualFilename(value: String): Self = StObject.set(x, "actualFilename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDiffFilename(value: String): Self = StObject.set(x, "diffFilename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDiffFilenameUndefined: Self = StObject.set(x, "diffFilename", js.undefined)
      
      @scala.inline
      def setExpectedFilename(value: String): Self = StObject.set(x, "expectedFilename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGenerateOnlyDiffFile(value: Boolean): Self = StObject.set(x, "generateOnlyDiffFile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGenerateOnlyDiffFileUndefined: Self = StObject.set(x, "generateOnlyDiffFile", js.undefined)
      
      @scala.inline
      def setOptions(value: IncludeAA): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    }
  }
  
  trait ImgDiffResult extends StObject {
    
    var diffCount: Double
    
    var height: Double
    
    var imagesAreSame: Boolean
    
    var width: Double
  }
  object ImgDiffResult {
    
    @scala.inline
    def apply(diffCount: Double, height: Double, imagesAreSame: Boolean, width: Double): ImgDiffResult = {
      val __obj = js.Dynamic.literal(diffCount = diffCount.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], imagesAreSame = imagesAreSame.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[ImgDiffResult]
    }
    
    @scala.inline
    implicit class ImgDiffResultMutableBuilder[Self <: ImgDiffResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDiffCount(value: Double): Self = StObject.set(x, "diffCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImagesAreSame(value: Boolean): Self = StObject.set(x, "imagesAreSame", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
