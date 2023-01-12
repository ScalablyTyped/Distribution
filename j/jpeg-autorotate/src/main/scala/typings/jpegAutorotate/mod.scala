package typings.jpegAutorotate

import typings.node.bufferMod.global.Buffer
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jpeg-autorotate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait errors extends StObject
  @JSImport("jpeg-autorotate", "errors")
  @js.native
  object errors extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[errors & String] = js.native
    
    @js.native
    sealed trait correct_orientation
      extends StObject
         with errors
    /* "correct_orientation" */ val correct_orientation: typings.jpegAutorotate.mod.errors.correct_orientation & String = js.native
    
    @js.native
    sealed trait no_orientation
      extends StObject
         with errors
    /* "no_orientation" */ val no_orientation: typings.jpegAutorotate.mod.errors.no_orientation & String = js.native
    
    @js.native
    sealed trait read_exif
      extends StObject
         with errors
    /* "read_exif" */ val read_exif: typings.jpegAutorotate.mod.errors.read_exif & String = js.native
    
    @js.native
    sealed trait read_file
      extends StObject
         with errors
    /* "read_file" */ val read_file: typings.jpegAutorotate.mod.errors.read_file & String = js.native
    
    @js.native
    sealed trait rotate_file
      extends StObject
         with errors
    /* "rotate_file" */ val rotate_file: typings.jpegAutorotate.mod.errors.rotate_file & String = js.native
    
    @js.native
    sealed trait unknown_orientation
      extends StObject
         with errors
    /* "unknown_orientation" */ val unknown_orientation: typings.jpegAutorotate.mod.errors.unknown_orientation & String = js.native
  }
  
  inline def rotate(path_or_buffer: String, options: RotateOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("rotate")(path_or_buffer.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def rotate(
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
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("rotate")(path_or_buffer.asInstanceOf[js.Any], options.asInstanceOf[js.Any], module_callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def rotate(path_or_buffer: Buffer, options: RotateOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("rotate")(path_or_buffer.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def rotate(
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
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("rotate")(path_or_buffer.asInstanceOf[js.Any], options.asInstanceOf[js.Any], module_callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def rotate_Promise(path_or_buffer: String, options: RotateOptions): js.Promise[typings.jpegAutorotate.anon.Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("rotate")(path_or_buffer.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.jpegAutorotate.anon.Buffer]]
  inline def rotate_Promise(path_or_buffer: Buffer, options: RotateOptions): js.Promise[typings.jpegAutorotate.anon.Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("rotate")(path_or_buffer.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.jpegAutorotate.anon.Buffer]]
  
  trait CustomError
    extends StObject
       with Error {
    
    var code: errors
  }
  object CustomError {
    
    inline def apply(code: errors, message: String, name: String): CustomError = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomError]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CustomError] (val x: Self) extends AnyVal {
      
      inline def setCode(value: errors): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    }
  }
  
  trait RotateDimensions extends StObject {
    
    var height: Double
    
    var width: Double
  }
  object RotateDimensions {
    
    inline def apply(height: Double, width: Double): RotateDimensions = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[RotateDimensions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RotateDimensions] (val x: Self) extends AnyVal {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait RotateOptions extends StObject {
    
    var quality: js.UndefOr[Double] = js.undefined
  }
  object RotateOptions {
    
    inline def apply(): RotateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RotateOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RotateOptions] (val x: Self) extends AnyVal {
      
      inline def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
      
      inline def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
    }
  }
}
