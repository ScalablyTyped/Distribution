package typings.ibmCloudSdkCore

import typings.ibmCloudSdkCore.helperMod.FileObject
import typings.node.Buffer
import typings.std.File
import typings.std.ReadableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object contentTypeMod {
  
  object default {
    
    @JSImport("ibm-cloud-sdk-core/lib/content-type", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def fromFilename(file: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("fromFilename")(file.asInstanceOf[js.Any]).asInstanceOf[String]
    @scala.inline
    def fromFilename(file: FileObject): String = ^.asInstanceOf[js.Dynamic].applyDynamic("fromFilename")(file.asInstanceOf[js.Any]).asInstanceOf[String]
    @scala.inline
    def fromFilename(file: Buffer): String = ^.asInstanceOf[js.Dynamic].applyDynamic("fromFilename")(file.asInstanceOf[js.Any]).asInstanceOf[String]
    @scala.inline
    def fromFilename(file: File): String = ^.asInstanceOf[js.Dynamic].applyDynamic("fromFilename")(file.asInstanceOf[js.Any]).asInstanceOf[String]
    @scala.inline
    def fromFilename(file: ReadableStream[js.Any]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("fromFilename")(file.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @scala.inline
    def fromHeader(buffer: Buffer): String = ^.asInstanceOf[js.Dynamic].applyDynamic("fromHeader")(buffer.asInstanceOf[js.Any]).asInstanceOf[String]
  }
}
