package typings.jimpCore.jimpMod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable4
import typings.jimpCore.etcMod.Bitmap
import typings.jimpCore.etcMod.GenericCallback
import typings.jimpCore.etcMod.ImageCallback
import typings.jimpCore.etcMod.RGB
import typings.jimpCore.etcMod.RGBA
import typings.jimpCore.etcMod.URLOptions
import typings.jimpCore.jimpCoreNumbers.`-1`
import typings.jimpCore.jimpCoreNumbers.`16`
import typings.jimpCore.jimpCoreNumbers.`1`
import typings.jimpCore.jimpCoreNumbers.`2`
import typings.jimpCore.jimpCoreNumbers.`32`
import typings.jimpCore.jimpCoreNumbers.`3`
import typings.jimpCore.jimpCoreNumbers.`4`
import typings.jimpCore.jimpCoreNumbers.`8`
import typings.node.Buffer
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JimpConstructors
  extends // Constructors
// For custom constructors when using Jimp.appendConstructorOption
Instantiable1[
      (/* args (repeated) */ js.Any) | (/* data */ Bitmap) | (/* data */ Buffer) | (/* image */ Jimp) | (/* path */ String) | (/* urlOptions */ URLOptions), 
      /* import warning: importer.ImportType#apply Failed type conversion: @jimp/core.@jimp/core/types/jimp.JimpConstructors['prototype'] */ js.Any
    ]
     with Instantiable2[
      (/* data */ Bitmap) | (/* data */ Buffer) | (/* w */ Double) | (/* image */ Jimp) | (/* path */ String) | (/* urlOptions */ URLOptions), 
      (/* h */ Double) | (/* cb */ ImageCallback[
        /* import warning: importer.ImportType#apply Failed type conversion: @jimp/core.@jimp/core/types/jimp.JimpConstructors['prototype'] */ js.Any
      ]), 
      /* import warning: importer.ImportType#apply Failed type conversion: @jimp/core.@jimp/core/types/jimp.JimpConstructors['prototype'] */ js.Any
    ]
     with Instantiable3[
      /* w */ Double, 
      /* h */ Double, 
      (/* background */ Double) | (/* cb */ ImageCallback[
        /* import warning: importer.ImportType#apply Failed type conversion: @jimp/core.@jimp/core/types/jimp.JimpConstructors['prototype'] */ js.Any
      ]) | (/* background */ String), 
      /* import warning: importer.ImportType#apply Failed type conversion: @jimp/core.@jimp/core/types/jimp.JimpConstructors['prototype'] */ js.Any
    ]
     with Instantiable4[
      /* w */ Double, 
      /* h */ Double, 
      js.UndefOr[(/* background */ Double) | (/* background */ String)], 
      /* cb */ ImageCallback[
        /* import warning: importer.ImportType#apply Failed type conversion: @jimp/core.@jimp/core/types/jimp.JimpConstructors['prototype'] */ js.Any
      ], 
      /* import warning: importer.ImportType#apply Failed type conversion: @jimp/core.@jimp/core/types/jimp.JimpConstructors['prototype'] */ js.Any
    ] {
  
  // Constants
  var AUTO: `-1` = js.native
  
  var BLEND_ADD: String = js.native
  
  var BLEND_DARKEN: String = js.native
  
  var BLEND_DESTINATION_OVER: String = js.native
  
  var BLEND_DIFFERENCE: String = js.native
  
  var BLEND_EXCLUSION: String = js.native
  
  var BLEND_HARDLIGHT: String = js.native
  
  var BLEND_LIGHTEN: String = js.native
  
  var BLEND_MULTIPLY: String = js.native
  
  var BLEND_OVERLAY: String = js.native
  
  var BLEND_SCREEN: String = js.native
  
  // blend modes
  var BLEND_SOURCE_OVER: String = js.native
  
  var EDGE_CROP: `3` = js.native
  
  // Edge Handling
  var EDGE_EXTEND: `1` = js.native
  
  var EDGE_WRAP: `2` = js.native
  
  var HORIZONTAL_ALIGN_CENTER: `2` = js.native
  
  // Align modes for cover, contain, bit masks
  var HORIZONTAL_ALIGN_LEFT: `1` = js.native
  
  var HORIZONTAL_ALIGN_RIGHT: `4` = js.native
  
  var VERTICAL_ALIGN_BOTTOM: `32` = js.native
  
  var VERTICAL_ALIGN_MIDDLE: `16` = js.native
  
  var VERTICAL_ALIGN_TOP: `8` = js.native
  
  // Functions
  /**
    * I'd like to make `Args` generic and used in `run` and `test` but alas,
    * it's not possible RN:
    * https://github.com/microsoft/TypeScript/issues/26113
    */
  def appendConstructorOption[Args /* <: js.Array[_] */, J /* <: Jimp */](
    name: String,
    test: js.Function1[/* repeated */ js.Any, Boolean],
    run: js.ThisFunction3[
      /* this */ J, 
      /* resolve */ js.Function1[/* jimp */ js.UndefOr[J], _], 
      /* reject */ js.Function1[/* reason */ Error, _], 
      /* repeated */ js.Any, 
      _
    ]
  ): Unit = js.native
  
  def colorDiff(rgba1: RGBA, rgba2: RGBA): Double = js.native
  def colorDiff(rgba1: RGB, rgba2: RGB): Double = js.native
  
  def compareHashes(hash1: String, hash2: String): Double = js.native
  
  def create(data: Buffer): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: this['prototype'] */ js.Any
  ] = js.native
  def create(image: Jimp): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: this['prototype'] */ js.Any
  ] = js.native
  def create(path: String): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: this['prototype'] */ js.Any
  ] = js.native
  def create(w: Double, h: Double): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: this['prototype'] */ js.Any
  ] = js.native
  def create(w: Double, h: Double, background: String): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: this['prototype'] */ js.Any
  ] = js.native
  def create(w: Double, h: Double, background: Double): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: this['prototype'] */ js.Any
  ] = js.native
  
  def cssColorToHex(cssColor: String): Double = js.native
  
  def diff(img1: Jimp, img2: Jimp): DiffReturn[
    /* import warning: importer.ImportType#apply Failed type conversion: this['prototype'] */ js.Any
  ] = js.native
  def diff(img1: Jimp, img2: Jimp, threshold: Double): DiffReturn[
    /* import warning: importer.ImportType#apply Failed type conversion: this['prototype'] */ js.Any
  ] = js.native
  
  def distance(img1: Jimp, img2: Jimp): Double = js.native
  
  def intToRGBA(i: Double): RGBA = js.native
  def intToRGBA(i: Double, cb: GenericCallback[RGBA, _, _]): RGBA = js.native
  
  def limit255(n: Double): Double = js.native
  
  def read(data: Buffer): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: this['prototype'] */ js.Any
  ] = js.native
  def read(image: Jimp): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: this['prototype'] */ js.Any
  ] = js.native
  def read(path: String): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: this['prototype'] */ js.Any
  ] = js.native
  def read(w: Double, h: Double): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: this['prototype'] */ js.Any
  ] = js.native
  def read(w: Double, h: Double, background: String): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: this['prototype'] */ js.Any
  ] = js.native
  def read(w: Double, h: Double, background: Double): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: this['prototype'] */ js.Any
  ] = js.native
  @JSName("read")
  def read_prototype(
    data: Buffer,
    cb: ImageCallback[
      /* import warning: importer.ImportType#apply Failed type conversion: this['prototype'] */ js.Any
    ]
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: this['prototype'] */ js.Any
  ] = js.native
  @JSName("read")
  def read_prototype(
    image: Jimp,
    cb: ImageCallback[
      /* import warning: importer.ImportType#apply Failed type conversion: this['prototype'] */ js.Any
    ]
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: this['prototype'] */ js.Any
  ] = js.native
  @JSName("read")
  def read_prototype(
    path: String,
    cb: ImageCallback[
      /* import warning: importer.ImportType#apply Failed type conversion: this['prototype'] */ js.Any
    ]
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: this['prototype'] */ js.Any
  ] = js.native
  @JSName("read")
  def read_prototype(
    w: Double,
    h: Double,
    background: js.UndefOr[scala.Nothing],
    cb: ImageCallback[
      /* import warning: importer.ImportType#apply Failed type conversion: this['prototype'] */ js.Any
    ]
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: this['prototype'] */ js.Any
  ] = js.native
  @JSName("read")
  def read_prototype(
    w: Double,
    h: Double,
    background: String,
    cb: ImageCallback[
      /* import warning: importer.ImportType#apply Failed type conversion: this['prototype'] */ js.Any
    ]
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: this['prototype'] */ js.Any
  ] = js.native
  @JSName("read")
  def read_prototype(
    w: Double,
    h: Double,
    background: Double,
    cb: ImageCallback[
      /* import warning: importer.ImportType#apply Failed type conversion: this['prototype'] */ js.Any
    ]
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: this['prototype'] */ js.Any
  ] = js.native
  
  def rgbaToInt(r: Double, g: Double, b: Double, a: Double): Double = js.native
  @JSName("rgbaToInt")
  def rgbaToInt_prototype(
    r: Double,
    g: Double,
    b: Double,
    a: Double,
    cb: GenericCallback[
      Double, 
      _, 
      /* import warning: importer.ImportType#apply Failed type conversion: this['prototype'] */ js.Any
    ]
  ): Double = js.native
}
