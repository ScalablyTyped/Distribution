package typings.kdbxweb.mod

import typings.kdbxweb.anon.Aes
import typings.kdbxweb.anon.Apple
import typings.kdbxweb.anon.ArcFourVariant
import typings.kdbxweb.anon.Argon2
import typings.kdbxweb.anon.BadSignature
import typings.kdbxweb.anon.FileMagic
import typings.kdbxweb.anon.GZip
import typings.kdbxweb.anon.HistoryMaxItems
import typings.kdbxweb.anon.None
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Consts {
  
  @JSImport("kdbxweb", "Consts")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("kdbxweb", "Consts.AutoTypeObfuscationOptions")
  @js.native
  def AutoTypeObfuscationOptions: None = js.native
  @scala.inline
  def AutoTypeObfuscationOptions_=(x: None): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AutoTypeObfuscationOptions")(x.asInstanceOf[js.Any])
  
  @JSImport("kdbxweb", "Consts.CipherId")
  @js.native
  def CipherId: Aes = js.native
  @scala.inline
  def CipherId_=(x: Aes): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CipherId")(x.asInstanceOf[js.Any])
  
  @JSImport("kdbxweb", "Consts.CompressionAlgorithm")
  @js.native
  def CompressionAlgorithm: GZip = js.native
  @scala.inline
  def CompressionAlgorithm_=(x: GZip): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CompressionAlgorithm")(x.asInstanceOf[js.Any])
  
  @JSImport("kdbxweb", "Consts.CrsAlgorithm")
  @js.native
  def CrsAlgorithm: ArcFourVariant = js.native
  @scala.inline
  def CrsAlgorithm_=(x: ArcFourVariant): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CrsAlgorithm")(x.asInstanceOf[js.Any])
  
  @JSImport("kdbxweb", "Consts.Defaults")
  @js.native
  def Defaults: HistoryMaxItems = js.native
  @scala.inline
  def Defaults_=(x: HistoryMaxItems): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Defaults")(x.asInstanceOf[js.Any])
  
  @JSImport("kdbxweb", "Consts.ErrorCodes")
  @js.native
  def ErrorCodes: BadSignature = js.native
  @scala.inline
  def ErrorCodes_=(x: BadSignature): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ErrorCodes")(x.asInstanceOf[js.Any])
  
  @JSImport("kdbxweb", "Consts.Icons")
  @js.native
  def Icons: Apple = js.native
  @scala.inline
  def Icons_=(x: Apple): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Icons")(x.asInstanceOf[js.Any])
  
  @JSImport("kdbxweb", "Consts.KdfId")
  @js.native
  def KdfId: Argon2 = js.native
  @scala.inline
  def KdfId_=(x: Argon2): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("KdfId")(x.asInstanceOf[js.Any])
  
  @JSImport("kdbxweb", "Consts.Signatures")
  @js.native
  def Signatures: FileMagic = js.native
  @scala.inline
  def Signatures_=(x: FileMagic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Signatures")(x.asInstanceOf[js.Any])
}
