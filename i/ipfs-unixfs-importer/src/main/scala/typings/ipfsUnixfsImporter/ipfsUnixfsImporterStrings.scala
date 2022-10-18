package typings.ipfsUnixfsImporter

import typings.ipfsUnixfsImporter.distSrcTypesMod.ChunkerType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ipfsUnixfsImporterStrings {
  
  @js.native
  sealed trait balanced extends StObject
  inline def balanced: balanced = "balanced".asInstanceOf[balanced]
  
  @js.native
  sealed trait file extends StObject
  inline def file: file = "file".asInstanceOf[file]
  
  @js.native
  sealed trait fixed
    extends StObject
       with ChunkerType
  inline def fixed: fixed = "fixed".asInstanceOf[fixed]
  
  @js.native
  sealed trait flat extends StObject
  inline def flat: flat = "flat".asInstanceOf[flat]
  
  @js.native
  sealed trait rabin
    extends StObject
       with ChunkerType
  inline def rabin: rabin = "rabin".asInstanceOf[rabin]
  
  @js.native
  sealed trait raw extends StObject
  inline def raw: raw = "raw".asInstanceOf[raw]
  
  @js.native
  sealed trait trickle extends StObject
  inline def trickle: trickle = "trickle".asInstanceOf[trickle]
}
