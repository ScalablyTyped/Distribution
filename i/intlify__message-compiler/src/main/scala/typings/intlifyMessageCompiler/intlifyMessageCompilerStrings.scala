package typings.intlifyMessageCompiler

import typings.intlifyMessageCompiler.mod.CompileDomain
import typings.intlifyMessageCompiler.mod.HelperNameMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object intlifyMessageCompilerStrings {
  
  @js.native
  sealed trait Linefeed extends StObject
  inline def Linefeed: Linefeed = "\n".asInstanceOf[Linefeed]
  
  @js.native
  sealed trait Semicolon extends StObject
  inline def Semicolon: Semicolon = ";".asInstanceOf[Semicolon]
  
  @js.native
  sealed trait arrow extends StObject
  inline def arrow: arrow = "arrow".asInstanceOf[arrow]
  
  @js.native
  sealed trait compiler
    extends StObject
       with CompileDomain
  inline def compiler: compiler = "compiler".asInstanceOf[compiler]
  
  @js.native
  sealed trait generator
    extends StObject
       with CompileDomain
  inline def generator: generator = "generator".asInstanceOf[generator]
  
  @js.native
  sealed trait interpolate
    extends StObject
       with HelperNameMap
  inline def interpolate: interpolate = "interpolate".asInstanceOf[interpolate]
  
  @js.native
  sealed trait linked
    extends StObject
       with HelperNameMap
  inline def linked: linked = "linked".asInstanceOf[linked]
  
  @js.native
  sealed trait list
    extends StObject
       with HelperNameMap
  inline def list: list = "list".asInstanceOf[list]
  
  @js.native
  sealed trait message
    extends StObject
       with HelperNameMap
  inline def message: message = "message".asInstanceOf[message]
  
  @js.native
  sealed trait named
    extends StObject
       with HelperNameMap
  inline def named: named = "named".asInstanceOf[named]
  
  @js.native
  sealed trait normal extends StObject
  inline def normal: normal = "normal".asInstanceOf[normal]
  
  @js.native
  sealed trait normalize
    extends StObject
       with HelperNameMap
  inline def normalize: normalize = "normalize".asInstanceOf[normalize]
  
  @js.native
  sealed trait parser
    extends StObject
       with CompileDomain
  inline def parser: parser = "parser".asInstanceOf[parser]
  
  @js.native
  sealed trait plural
    extends StObject
       with HelperNameMap
  inline def plural: plural = "plural".asInstanceOf[plural]
  
  @js.native
  sealed trait tokenizer
    extends StObject
       with CompileDomain
  inline def tokenizer: tokenizer = "tokenizer".asInstanceOf[tokenizer]
  
  @js.native
  sealed trait transformer
    extends StObject
       with CompileDomain
  inline def transformer: transformer = "transformer".asInstanceOf[transformer]
  
  @js.native
  sealed trait `type`
    extends StObject
       with HelperNameMap
  inline def `type`: `type` = "type".asInstanceOf[`type`]
}
