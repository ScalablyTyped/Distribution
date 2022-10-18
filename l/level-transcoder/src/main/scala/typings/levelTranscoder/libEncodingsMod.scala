package typings.levelTranscoder

import typings.levelTranscoder.libEncodingMod.KnownEncodingInput
import typings.levelTranscoder.libEncodingMod.KnownEncodingOutput
import typings.levelTranscoder.libFormatsMod.BufferFormat
import typings.levelTranscoder.libFormatsMod.UTF8Format
import typings.levelTranscoder.libFormatsMod.ViewFormat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEncodingsMod {
  
  @JSImport("level-transcoder/lib/encodings", "base64")
  @js.native
  val base64: BufferFormat[
    KnownEncodingInput[typings.levelTranscoder.levelTranscoderStrings.base64], 
    KnownEncodingOutput[typings.levelTranscoder.levelTranscoderStrings.base64]
  ] = js.native
  
  @JSImport("level-transcoder/lib/encodings", "buffer")
  @js.native
  val buffer: BufferFormat[
    KnownEncodingInput[typings.levelTranscoder.levelTranscoderStrings.buffer], 
    KnownEncodingOutput[typings.levelTranscoder.levelTranscoderStrings.buffer]
  ] = js.native
  
  @JSImport("level-transcoder/lib/encodings", "hex")
  @js.native
  val hex: BufferFormat[
    KnownEncodingInput[typings.levelTranscoder.levelTranscoderStrings.hex], 
    KnownEncodingOutput[typings.levelTranscoder.levelTranscoderStrings.hex]
  ] = js.native
  
  @JSImport("level-transcoder/lib/encodings", "json")
  @js.native
  val json: UTF8Format[
    KnownEncodingInput[typings.levelTranscoder.levelTranscoderStrings.json], 
    KnownEncodingOutput[typings.levelTranscoder.levelTranscoderStrings.json]
  ] = js.native
  
  @JSImport("level-transcoder/lib/encodings", "utf8")
  @js.native
  val utf8: UTF8Format[
    KnownEncodingInput[typings.levelTranscoder.levelTranscoderStrings.utf8], 
    KnownEncodingOutput[typings.levelTranscoder.levelTranscoderStrings.utf8]
  ] = js.native
  
  @JSImport("level-transcoder/lib/encodings", "view")
  @js.native
  val view: ViewFormat[
    KnownEncodingInput[typings.levelTranscoder.levelTranscoderStrings.view], 
    KnownEncodingOutput[typings.levelTranscoder.levelTranscoderStrings.view]
  ] = js.native
}
