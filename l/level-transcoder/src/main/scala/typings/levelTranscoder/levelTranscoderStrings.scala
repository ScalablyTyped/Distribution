package typings.levelTranscoder

import typings.levelTranscoder.encodingMod.KnownEncodingName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object levelTranscoderStrings {
  
  @js.native
  sealed trait base64
    extends StObject
       with KnownEncodingName
  inline def base64: base64 = "base64".asInstanceOf[base64]
  
  @js.native
  sealed trait buffer
    extends StObject
       with KnownEncodingName
  inline def buffer: buffer = "buffer".asInstanceOf[buffer]
  
  @js.native
  sealed trait format extends StObject
  inline def format: format = "format".asInstanceOf[format]
  
  @js.native
  sealed trait hex
    extends StObject
       with KnownEncodingName
  inline def hex: hex = "hex".asInstanceOf[hex]
  
  @js.native
  sealed trait json
    extends StObject
       with KnownEncodingName
  inline def json: json = "json".asInstanceOf[json]
  
  @js.native
  sealed trait utf8
    extends StObject
       with KnownEncodingName
  inline def utf8: utf8 = "utf8".asInstanceOf[utf8]
  
  @js.native
  sealed trait view
    extends StObject
       with KnownEncodingName
  inline def view: view = "view".asInstanceOf[view]
}
