package typings.kuromoji

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type IpadicFormatter = typings.kuromoji.mod.Formatter[typings.kuromoji.mod.IpadicFeatures]
  
  type UnknownDictionary = typings.kuromoji.mod.TokenInfoDictionary
  
  @scala.inline
  def builder(option: typings.kuromoji.mod.TokenizerBuilderOption): typings.kuromoji.mod.TokenizerBuilder[typings.kuromoji.mod.IpadicFeatures] = typings.kuromoji.mod.^.asInstanceOf[js.Dynamic].applyDynamic("builder")(option.asInstanceOf[js.Any]).asInstanceOf[typings.kuromoji.mod.TokenizerBuilder[typings.kuromoji.mod.IpadicFeatures]]
  
  @scala.inline
  def dictionaryBuilder(): typings.kuromoji.mod.DictionaryBuilder_ = typings.kuromoji.mod.^.asInstanceOf[js.Dynamic].applyDynamic("dictionaryBuilder")().asInstanceOf[typings.kuromoji.mod.DictionaryBuilder_]
}
