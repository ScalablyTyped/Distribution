package typings.imgDiffJs

import typings.imgDiffJs.anon.IncludeAA
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("img-diff-js", "imgDiff")
  @js.native
  def imgDiff(opt: ImgDiffOptions): js.Promise[ImgDiffResult] = js.native
  
  @JSImport("img-diff-js", "registerDecoder")
  @js.native
  def registerDecoder(extensions: js.Array[String], decoder: js.Function1[/* filename */ String, _]): Unit = js.native
  
  @js.native
  trait ImgDiffOptions extends StObject {
    
    var actualFilename: String = js.native
    
    var diffFilename: js.UndefOr[String] = js.native
    
    var expectedFilename: String = js.native
    
    /** {default:false} */
    var generateOnlyDiffFile: js.UndefOr[Boolean] = js.native
    
    var options: js.UndefOr[IncludeAA] = js.native
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
  
  @js.native
  trait ImgDiffResult extends StObject {
    
    var diffCount: Double = js.native
    
    var height: Double = js.native
    
    var imagesAreSame: Boolean = js.native
    
    var width: Double = js.native
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
