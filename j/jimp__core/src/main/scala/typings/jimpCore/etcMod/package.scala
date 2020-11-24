package typings.jimpCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object etcMod {
  
  type DecoderFn = js.Function1[/* data */ typings.node.Buffer, typings.jimpCore.etcMod.Bitmap]
  
  type EncoderFn[ImageType /* <: typings.jimpCore.etcMod.Image */] = js.Function1[/* image */ ImageType, typings.node.Buffer]
  
  type GenericCallback[T, U, TThis] = js.ThisFunction2[/* this */ TThis, /* err */ typings.std.Error | scala.Null, /* value */ T, U]
  
  type ImageCallback[jimp] = js.ThisFunction3[
    /* this */ jimp, 
    /* err */ typings.std.Error | scala.Null, 
    /* value */ jimp, 
    /* coords */ typings.jimpCore.anon.X, 
    js.Any
  ]
}
