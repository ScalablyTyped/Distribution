package typings.highlightJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object highlightJsStrings {
  
  @js.native
  sealed trait afterColonhighlight
    extends StObject
       with PluginEvent
  @scala.inline
  def afterColonhighlight: afterColonhighlight = "after:highlight".asInstanceOf[afterColonhighlight]
  
  @js.native
  sealed trait afterColonhighlightBlock
    extends StObject
       with PluginEvent
  @scala.inline
  def afterColonhighlightBlock: afterColonhighlightBlock = "after:highlightBlock".asInstanceOf[afterColonhighlightBlock]
  
  @js.native
  sealed trait beforeColonhighlight
    extends StObject
       with PluginEvent
  @scala.inline
  def beforeColonhighlight: beforeColonhighlight = "before:highlight".asInstanceOf[beforeColonhighlight]
  
  @js.native
  sealed trait beforeColonhighlightBlock
    extends StObject
       with PluginEvent
  @scala.inline
  def beforeColonhighlightBlock: beforeColonhighlightBlock = "before:highlightBlock".asInstanceOf[beforeColonhighlightBlock]
  
  @js.native
  sealed trait begin
    extends StObject
       with MatchType
  @scala.inline
  def begin: begin = "begin".asInstanceOf[begin]
  
  @js.native
  sealed trait end
    extends StObject
       with MatchType
  @scala.inline
  def end: end = "end".asInstanceOf[end]
  
  @js.native
  sealed trait illegal
    extends StObject
       with MatchType
  @scala.inline
  def illegal: illegal = "illegal".asInstanceOf[illegal]
  
  @js.native
  sealed trait self extends StObject
  @scala.inline
  def self: self = "self".asInstanceOf[self]
}
