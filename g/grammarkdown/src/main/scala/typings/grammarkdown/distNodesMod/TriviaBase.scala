package typings.grammarkdown.distNodesMod

import typings.grammarkdown.distTokensMod.TriviaKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("grammarkdown/dist/nodes", "TriviaBase")
@js.native
open class TriviaBase[TKind /* <: TriviaKind */] protected () extends Node[TKind] {
  def this(kind: TKind) = this()
  
  /* private */ var _hasFollowingBlankLine: Any = js.native
  
  /* private */ var _hasFollowingLineTerminator: Any = js.native
  
  /* private */ var _hasFollowingWhiteSpace: Any = js.native
  
  /* private */ var _hasPrecedingBlankLine: Any = js.native
  
  /* private */ var _hasPrecedingLineTerminator: Any = js.native
  
  /* private */ var _hasPrecedingWhiteSpace: Any = js.native
  
  def hasFollowingBlankLine: Boolean = js.native
  
  def hasFollowingLineTerminator: Boolean = js.native
  
  def hasFollowingWhiteSpace: Boolean = js.native
  
  def hasPrecedingBlankLine: Boolean = js.native
  
  def hasPrecedingLineTerminator: Boolean = js.native
  
  def hasPrecedingWhiteSpace: Boolean = js.native
}
