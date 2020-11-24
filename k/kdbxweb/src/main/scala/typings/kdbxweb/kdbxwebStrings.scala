package typings.kdbxweb

import typings.kdbxweb.mod.KdbxErrorCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object kdbxwebStrings {
  
  @scala.inline
  def BadSignature: BadSignature = "BadSignature".asInstanceOf[BadSignature]
  
  @scala.inline
  def FileCorrupt: FileCorrupt = "FileCorrupt".asInstanceOf[FileCorrupt]
  
  @scala.inline
  def InvalidArg: InvalidArg = "InvalidArg".asInstanceOf[InvalidArg]
  
  @scala.inline
  def InvalidKey: InvalidKey = "InvalidKey".asInstanceOf[InvalidKey]
  
  @scala.inline
  def InvalidVersion: InvalidVersion = "InvalidVersion".asInstanceOf[InvalidVersion]
  
  @scala.inline
  def KdbxError: KdbxError = "KdbxError".asInstanceOf[KdbxError]
  
  @scala.inline
  def MergeError: MergeError = "MergeError".asInstanceOf[MergeError]
  
  @scala.inline
  def NotImplemented: NotImplemented = "NotImplemented".asInstanceOf[NotImplemented]
  
  @scala.inline
  def Unsupported: Unsupported = "Unsupported".asInstanceOf[Unsupported]
  
  @js.native
  sealed trait BadSignature extends KdbxErrorCode
  
  @js.native
  sealed trait FileCorrupt extends KdbxErrorCode
  
  @js.native
  sealed trait InvalidArg extends KdbxErrorCode
  
  @js.native
  sealed trait InvalidKey extends KdbxErrorCode
  
  @js.native
  sealed trait InvalidVersion extends KdbxErrorCode
  
  @js.native
  sealed trait KdbxError extends js.Object
  
  @js.native
  sealed trait MergeError extends KdbxErrorCode
  
  @js.native
  sealed trait NotImplemented extends KdbxErrorCode
  
  @js.native
  sealed trait Unsupported extends KdbxErrorCode
}
