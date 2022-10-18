package typings.ipfsUnixfsExporter

import typings.ipfsUnixfsExporter.anon.Length
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcUtilsValidateOffsetAndLengthMod {
  
  @JSImport("ipfs-unixfs-exporter/dist/src/utils/validate-offset-and-length", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @param {number} size
    * @param {number} [offset]
    * @param {number} [length]
    */
  inline def default(size: Double): Length = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(size.asInstanceOf[js.Any]).asInstanceOf[Length]
  inline def default(size: Double, offset: Double): Length = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(size.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Length]
  inline def default(size: Double, offset: Double, length: Double): Length = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(size.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Length]
  inline def default(size: Double, offset: Unit, length: Double): Length = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(size.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Length]
}
