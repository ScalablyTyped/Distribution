package typings.indySdk

import typings.indySdk.mod.KeyDerivationMethod
import typings.indySdk.mod.NymRole
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object indySdkStrings {
  
  @js.native
  sealed trait `1Dot0` extends StObject
  inline def `1Dot0`: `1Dot0` = "1.0".asInstanceOf[`1Dot0`]
  
  @js.native
  sealed trait `2Dot0` extends StObject
  inline def `2Dot0`: `2Dot0` = "2.0".asInstanceOf[`2Dot0`]
  
  @js.native
  sealed trait ARGON2I_INT
    extends StObject
       with KeyDerivationMethod
  inline def ARGON2I_INT: ARGON2I_INT = "ARGON2I_INT".asInstanceOf[ARGON2I_INT]
  
  @js.native
  sealed trait ARGON2I_MOD
    extends StObject
       with KeyDerivationMethod
  inline def ARGON2I_MOD: ARGON2I_MOD = "ARGON2I_MOD".asInstanceOf[ARGON2I_MOD]
  
  @js.native
  sealed trait CL_ACCUM extends StObject
  inline def CL_ACCUM: CL_ACCUM = "CL_ACCUM".asInstanceOf[CL_ACCUM]
  
  @js.native
  sealed trait CONFIG extends StObject
  inline def CONFIG: CONFIG = "CONFIG".asInstanceOf[CONFIG]
  
  @js.native
  sealed trait DOMAIN extends StObject
  inline def DOMAIN: DOMAIN = "DOMAIN".asInstanceOf[DOMAIN]
  
  @js.native
  sealed trait ENDORSER
    extends StObject
       with NymRole
  inline def ENDORSER: ENDORSER = "ENDORSER".asInstanceOf[ENDORSER]
  
  @js.native
  sealed trait Greaterthansign extends StObject
  inline def Greaterthansign: Greaterthansign = ">".asInstanceOf[Greaterthansign]
  
  @js.native
  sealed trait GreaterthansignEqualssign extends StObject
  inline def GreaterthansignEqualssign: GreaterthansignEqualssign = ">=".asInstanceOf[GreaterthansignEqualssign]
  
  @js.native
  sealed trait ISSUANCE_BY_DEFAULT extends StObject
  inline def ISSUANCE_BY_DEFAULT: ISSUANCE_BY_DEFAULT = "ISSUANCE_BY_DEFAULT".asInstanceOf[ISSUANCE_BY_DEFAULT]
  
  @js.native
  sealed trait ISSUANCE_ON_DEMAND extends StObject
  inline def ISSUANCE_ON_DEMAND: ISSUANCE_ON_DEMAND = "ISSUANCE_ON_DEMAND".asInstanceOf[ISSUANCE_ON_DEMAND]
  
  @js.native
  sealed trait Lessthansign extends StObject
  inline def Lessthansign: Lessthansign = "<".asInstanceOf[Lessthansign]
  
  @js.native
  sealed trait LessthansignEqualssign extends StObject
  inline def LessthansignEqualssign: LessthansignEqualssign = "<=".asInstanceOf[LessthansignEqualssign]
  
  @js.native
  sealed trait NETWORK_MONITOR
    extends StObject
       with NymRole
  inline def NETWORK_MONITOR: NETWORK_MONITOR = "NETWORK_MONITOR".asInstanceOf[NETWORK_MONITOR]
  
  @js.native
  sealed trait POOL extends StObject
  inline def POOL: POOL = "POOL".asInstanceOf[POOL]
  
  @js.native
  sealed trait RAW
    extends StObject
       with KeyDerivationMethod
  inline def RAW: RAW = "RAW".asInstanceOf[RAW]
  
  @js.native
  sealed trait REJECT extends StObject
  inline def REJECT: REJECT = "REJECT".asInstanceOf[REJECT]
  
  @js.native
  sealed trait REPLY extends StObject
  inline def REPLY: REPLY = "REPLY".asInstanceOf[REPLY]
  
  @js.native
  sealed trait REQNACK extends StObject
  inline def REQNACK: REQNACK = "REQNACK".asInstanceOf[REQNACK]
  
  @js.native
  sealed trait STEWARD
    extends StObject
       with NymRole
  inline def STEWARD: STEWARD = "STEWARD".asInstanceOf[STEWARD]
  
  @js.native
  sealed trait TRUSTEE
    extends StObject
       with NymRole
  inline def TRUSTEE: TRUSTEE = "TRUSTEE".asInstanceOf[TRUSTEE]
  
  @js.native
  sealed trait TRUST_ANCHOR
    extends StObject
       with NymRole
  inline def TRUST_ANCHOR: TRUST_ANCHOR = "TRUST_ANCHOR".asInstanceOf[TRUST_ANCHOR]
  
  @js.native
  sealed trait debug extends StObject
  inline def debug: debug = "debug".asInstanceOf[debug]
  
  @js.native
  sealed trait ed25519 extends StObject
  inline def ed25519: ed25519 = "ed25519".asInstanceOf[ed25519]
  
  @js.native
  sealed trait info extends StObject
  inline def info: info = "info".asInstanceOf[info]
  
  @js.native
  sealed trait trace extends StObject
  inline def trace: trace = "trace".asInstanceOf[trace]
}
