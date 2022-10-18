package typings.imgDiffJs

import typings.pixelmatch.mod.PixelmatchOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesMod {
  
  type Decorder = js.Function1[/* filename */ String, js.Promise[ImageData]]
  
  trait ImageData extends StObject {
    
    var data: js.typedarray.Uint8Array
    
    var height: Double
    
    var width: Double
  }
  object ImageData {
    
    inline def apply(data: js.typedarray.Uint8Array, height: Double, width: Double): ImageData = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[ImageData]
    }
    
    extension [Self <: ImageData](x: Self) {
      
      inline def setData(value: js.typedarray.Uint8Array): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait ImgDiffOptions extends StObject {
    
    var actualFilename: String
    
    var diffFilename: js.UndefOr[String] = js.undefined
    
    var expectedFilename: String
    
    var generateOnlyDiffFile: js.UndefOr[Boolean] = js.undefined
    
    var options: js.UndefOr[PixelmatchOptions] = js.undefined
  }
  object ImgDiffOptions {
    
    inline def apply(actualFilename: String, expectedFilename: String): ImgDiffOptions = {
      val __obj = js.Dynamic.literal(actualFilename = actualFilename.asInstanceOf[js.Any], expectedFilename = expectedFilename.asInstanceOf[js.Any])
      __obj.asInstanceOf[ImgDiffOptions]
    }
    
    extension [Self <: ImgDiffOptions](x: Self) {
      
      inline def setActualFilename(value: String): Self = StObject.set(x, "actualFilename", value.asInstanceOf[js.Any])
      
      inline def setDiffFilename(value: String): Self = StObject.set(x, "diffFilename", value.asInstanceOf[js.Any])
      
      inline def setDiffFilenameUndefined: Self = StObject.set(x, "diffFilename", js.undefined)
      
      inline def setExpectedFilename(value: String): Self = StObject.set(x, "expectedFilename", value.asInstanceOf[js.Any])
      
      inline def setGenerateOnlyDiffFile(value: Boolean): Self = StObject.set(x, "generateOnlyDiffFile", value.asInstanceOf[js.Any])
      
      inline def setGenerateOnlyDiffFileUndefined: Self = StObject.set(x, "generateOnlyDiffFile", js.undefined)
      
      inline def setOptions(value: PixelmatchOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    }
  }
  
  trait ImgDiffResult extends StObject {
    
    var diffCount: Double
    
    var height: Double
    
    var imagesAreSame: Boolean
    
    var width: Double
  }
  object ImgDiffResult {
    
    inline def apply(diffCount: Double, height: Double, imagesAreSame: Boolean, width: Double): ImgDiffResult = {
      val __obj = js.Dynamic.literal(diffCount = diffCount.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], imagesAreSame = imagesAreSame.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[ImgDiffResult]
    }
    
    extension [Self <: ImgDiffResult](x: Self) {
      
      inline def setDiffCount(value: Double): Self = StObject.set(x, "diffCount", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setImagesAreSame(value: Boolean): Self = StObject.set(x, "imagesAreSame", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
