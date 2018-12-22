package typings
package jsshaLib.jsshaMod.jsSHANs

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
org.scalablytyped.runtime.Instantiable2[
      /* variant */ java.lang.String, 
      (/* inputFormat */ ArrayBufferDataFormat) | (/* inputFormat */ StringDataFormat), 
      Hasher[java.lang.String] | Hasher[stdLib.ArrayBuffer]
    ]
     with /**
         * Create a Hasher object.
         *
         * @param variant - The desired SHA variant (SHA-1, SHA-224, SHA-256,
         *   SHA-384, SHA-512, SHA3-224, SHA3-256, SHA3-384, SHA3-512, SHAKE128, or SHAKE256).
         * @param inputFormat The format of srcString.
         */
org.scalablytyped.runtime.Instantiable3[
      /* variant */ java.lang.String, 
      (/* inputFormat */ ArrayBufferDataFormat) | (/* inputFormat */ StringDataFormat), 
      /* options */ Options, 
      Hasher[java.lang.String] | Hasher[stdLib.ArrayBuffer]
    ]

