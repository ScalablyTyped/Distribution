package typings.ibmCloudSdkCore

import typings.ibmCloudSdkCore.esLibHelperMod.FileObject
import typings.node.NodeJS.ReadableStream
import typings.node.bufferMod.global.Buffer
import typings.std.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esLibContentTypeMod {
  
  object default {
    
    @JSImport("ibm-cloud-sdk-core/es/lib/content-type", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromFilename(file: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("fromFilename")(file.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def fromFilename(file: FileObject): String = ^.asInstanceOf[js.Dynamic].applyDynamic("fromFilename")(file.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def fromFilename(file: ReadableStream): String = ^.asInstanceOf[js.Dynamic].applyDynamic("fromFilename")(file.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def fromFilename(file: Buffer): String = ^.asInstanceOf[js.Dynamic].applyDynamic("fromFilename")(file.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def fromFilename(file: File): String = ^.asInstanceOf[js.Dynamic].applyDynamic("fromFilename")(file.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def fromHeader(buffer: Buffer): String = ^.asInstanceOf[js.Dynamic].applyDynamic("fromHeader")(buffer.asInstanceOf[js.Any]).asInstanceOf[String]
  }
}
