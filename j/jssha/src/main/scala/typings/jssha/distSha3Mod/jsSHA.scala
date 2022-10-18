package typings.jssha.distSha3Mod

import typings.jssha.anon.OutputLenNumber
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait jsSHA
  extends StObject
     with jsSHABase[js.Array[js.Array[Int64]], VariantType] {
  
  /**
    * Returns the the KMAC in the specified format.
    *
    * @param options Hashmap of extra outputs options. `outputLen` must be specified.
    * @returns The KMAC in the format specified.
    */
  /* protected */ def _getKMAC(options: OutputLenNumber): js.Array[Double] = js.native
  
  /**
    * Initialize CSHAKE variants.
    *
    * @param options Options containing CSHAKE params.
    * @param funcNameOverride Overrides any "funcName" present in `options` (used with KMAC)
    * @returns The delimiter to be used
    */
  /* protected */ def _initializeCSHAKE(): Double = js.native
  /* protected */ def _initializeCSHAKE(options: Unit, funcNameOverride: packedValue): Double = js.native
  /* protected */ def _initializeCSHAKE(options: CSHAKEOptionsNoEncodingType): Double = js.native
  /* protected */ def _initializeCSHAKE(options: CSHAKEOptionsNoEncodingType, funcNameOverride: packedValue): Double = js.native
  
  /**
    * Initialize KMAC variants.
    *
    * @param options Options containing KMAC params.
    */
  /* protected */ def _initializeKMAC(options: KMACOptionsNoEncodingType): Unit = js.native
}
