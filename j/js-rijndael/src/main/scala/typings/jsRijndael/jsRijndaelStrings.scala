package typings.jsRijndael

import typings.jsRijndael.mcryptMod.CipherAlgorithm
import typings.jsRijndael.mcryptMod.Mode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsRijndaelStrings {
  
  @js.native
  sealed trait cbc
    extends StObject
       with Mode
  inline def cbc: cbc = "cbc".asInstanceOf[cbc]
  
  @js.native
  sealed trait cfb
    extends StObject
       with Mode
  inline def cfb: cfb = "cfb".asInstanceOf[cfb]
  
  @js.native
  sealed trait ctr
    extends StObject
       with Mode
  inline def ctr: ctr = "ctr".asInstanceOf[ctr]
  
  @js.native
  sealed trait ecb
    extends StObject
       with Mode
  inline def ecb: ecb = "ecb".asInstanceOf[ecb]
  
  @js.native
  sealed trait ncfb
    extends StObject
       with Mode
  inline def ncfb: ncfb = "ncfb".asInstanceOf[ncfb]
  
  @js.native
  sealed trait nofb
    extends StObject
       with Mode
  inline def nofb: nofb = "nofb".asInstanceOf[nofb]
  
  @js.native
  sealed trait `rijndael-128`
    extends StObject
       with CipherAlgorithm
  inline def `rijndael-128`: `rijndael-128` = "rijndael-128".asInstanceOf[`rijndael-128`]
  
  @js.native
  sealed trait `rijndael-192`
    extends StObject
       with CipherAlgorithm
  inline def `rijndael-192`: `rijndael-192` = "rijndael-192".asInstanceOf[`rijndael-192`]
  
  @js.native
  sealed trait `rijndael-256`
    extends StObject
       with CipherAlgorithm
  inline def `rijndael-256`: `rijndael-256` = "rijndael-256".asInstanceOf[`rijndael-256`]
}
