package typings.jssha.mod

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait jsSHA
  extends /**
  * Create a Hasher object.
  *
  * @param variant - The desired SHA variant (SHA-1, SHA-224, SHA-256,
  *   SHA-384, SHA-512, SHA3-224, SHA3-256, SHA3-384, SHA3-512, SHAKE128, or SHAKE256).
  * @param inputFormat The format of srcString.
  */
Instantiable2[
      /* variant */ String, 
      (/* inputFormat */ ArrayBufferDataFormat) | (/* inputFormat */ StringDataFormat), 
      Hasher[ArrayBuffer | String]
    ]
     with Instantiable3[
      /* variant */ String, 
      (/* inputFormat */ ArrayBufferDataFormat) | (/* inputFormat */ StringDataFormat), 
      /* options */ Options, 
      Hasher[ArrayBuffer | String]
    ]

