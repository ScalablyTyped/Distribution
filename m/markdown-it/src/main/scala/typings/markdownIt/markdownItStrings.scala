package typings.markdownIt

import typings.markdownIt.libMod.PresetName
import typings.markdownIt.stateBlockMod.ParentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object markdownItStrings {
  
  @js.native
  sealed trait default
    extends StObject
       with PresetName
  @scala.inline
  def default: default = "default".asInstanceOf[default]
  
  @js.native
  sealed trait blockquote
    extends StObject
       with ParentType
  @scala.inline
  def blockquote: blockquote = "blockquote".asInstanceOf[blockquote]
  
  @js.native
  sealed trait commonmark
    extends StObject
       with PresetName
  @scala.inline
  def commonmark: commonmark = "commonmark".asInstanceOf[commonmark]
  
  @js.native
  sealed trait list
    extends StObject
       with ParentType
  @scala.inline
  def list: list = "list".asInstanceOf[list]
  
  @js.native
  sealed trait paragraph
    extends StObject
       with ParentType
  @scala.inline
  def paragraph: paragraph = "paragraph".asInstanceOf[paragraph]
  
  @js.native
  sealed trait reference
    extends StObject
       with ParentType
  @scala.inline
  def reference: reference = "reference".asInstanceOf[reference]
  
  @js.native
  sealed trait root
    extends StObject
       with ParentType
  @scala.inline
  def root: root = "root".asInstanceOf[root]
  
  @js.native
  sealed trait zero
    extends StObject
       with PresetName
  @scala.inline
  def zero: zero = "zero".asInstanceOf[zero]
}
