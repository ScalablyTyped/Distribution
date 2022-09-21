package typings.loremIpsum

import typings.loremIpsum.formatsMod.LoremFormat
import typings.loremIpsum.unitsMod.LoremUnit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loremIpsumStrings {
  
  @js.native
  sealed trait html
    extends StObject
       with LoremFormat
  inline def html: html = "html".asInstanceOf[html]
  
  @js.native
  sealed trait paragraph
    extends StObject
       with LoremUnit
  inline def paragraph: paragraph = "paragraph".asInstanceOf[paragraph]
  
  @js.native
  sealed trait paragraphs
    extends StObject
       with LoremUnit
  inline def paragraphs: paragraphs = "paragraphs".asInstanceOf[paragraphs]
  
  @js.native
  sealed trait plain
    extends StObject
       with LoremFormat
  inline def plain: plain = "plain".asInstanceOf[plain]
  
  @js.native
  sealed trait sentence
    extends StObject
       with LoremUnit
  inline def sentence: sentence = "sentence".asInstanceOf[sentence]
  
  @js.native
  sealed trait sentences
    extends StObject
       with LoremUnit
  inline def sentences: sentences = "sentences".asInstanceOf[sentences]
  
  @js.native
  sealed trait word
    extends StObject
       with LoremUnit
  inline def word: word = "word".asInstanceOf[word]
  
  @js.native
  sealed trait words
    extends StObject
       with LoremUnit
  inline def words: words = "words".asInstanceOf[words]
}
