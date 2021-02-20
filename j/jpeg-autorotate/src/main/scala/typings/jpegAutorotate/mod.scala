package typings.jpegAutorotate

import typings.node.Buffer
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @js.native
  sealed trait errors extends StObject
  @JSImport("jpeg-autorotate", "errors")
  @js.native
  object errors extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[errors with String] = js.native
    
    @js.native
    sealed trait correct_orientation extends errors
    /* "correct_orientation" */ val correct_orientation: typings.jpegAutorotate.mod.errors.correct_orientation with String = js.native
    
    @js.native
    sealed trait no_orientation extends errors
    /* "no_orientation" */ val no_orientation: typings.jpegAutorotate.mod.errors.no_orientation with String = js.native
    
    @js.native
    sealed trait read_exif extends errors
    /* "read_exif" */ val read_exif: typings.jpegAutorotate.mod.errors.read_exif with String = js.native
    
    @js.native
    sealed trait read_file extends errors
    /* "read_file" */ val read_file: typings.jpegAutorotate.mod.errors.read_file with String = js.native
    
    @js.native
    sealed trait rotate_file extends errors
    /* "rotate_file" */ val rotate_file: typings.jpegAutorotate.mod.errors.rotate_file with String = js.native
    
    @js.native
    sealed trait unknown_orientation extends errors
    /* "unknown_orientation" */ val unknown_orientation: typings.jpegAutorotate.mod.errors.unknown_orientation with String = js.native
  }
  
  @JSImport("jpeg-autorotate", "rotate")
  @js.native
  def rotate(path_or_buffer: String, options: RotateOptions): Unit = js.native
  @JSImport("jpeg-autorotate", "rotate")
  @js.native
  def rotate(
    path_or_buffer: String,
    options: RotateOptions,
    module_callback: js.Function5[
      /* error */ CustomError | Null, 
      /* buffer */ Buffer, 
      /* orientation */ Double | Null, 
      /* dimensions */ RotateDimensions | Null, 
      /* quality */ Double | Null, 
      Unit
    ]
  ): Unit = js.native
  @JSImport("jpeg-autorotate", "rotate")
  @js.native
  def rotate(path_or_buffer: Buffer, options: RotateOptions): Unit = js.native
  @JSImport("jpeg-autorotate", "rotate")
  @js.native
  def rotate(
    path_or_buffer: Buffer,
    options: RotateOptions,
    module_callback: js.Function5[
      /* error */ CustomError | Null, 
      /* buffer */ Buffer, 
      /* orientation */ Double | Null, 
      /* dimensions */ RotateDimensions | Null, 
      /* quality */ Double | Null, 
      Unit
    ]
  ): Unit = js.native
  @JSImport("jpeg-autorotate", "rotate")
  @js.native
  def rotate_Promise(path_or_buffer: String, options: RotateOptions): js.Promise[typings.jpegAutorotate.anon.Buffer] = js.native
  @JSImport("jpeg-autorotate", "rotate")
  @js.native
  def rotate_Promise(path_or_buffer: Buffer, options: RotateOptions): js.Promise[typings.jpegAutorotate.anon.Buffer] = js.native
  
  @js.native
  trait CustomError extends Error {
    
    var code: errors = js.native
  }
  object CustomError {
    
    @scala.inline
    def apply(code: errors, message: String, name: String): CustomError = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomError]
    }
    
    @scala.inline
    implicit class CustomErrorMutableBuilder[Self <: CustomError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: errors): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RotateDimensions extends StObject {
    
    var height: Double = js.native
    
    var width: Double = js.native
  }
  object RotateDimensions {
    
    @scala.inline
    def apply(height: Double, width: Double): RotateDimensions = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[RotateDimensions]
    }
    
    @scala.inline
    implicit class RotateDimensionsMutableBuilder[Self <: RotateDimensions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RotateOptions extends StObject {
    
    var quality: js.UndefOr[Double] = js.native
  }
  object RotateOptions {
    
    @scala.inline
    def apply(): RotateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RotateOptions]
    }
    
    @scala.inline
    implicit class RotateOptionsMutableBuilder[Self <: RotateOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
    }
  }
}
