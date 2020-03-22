package typings.jsdom

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typings.std.BlobPart
import typings.std.File
import typings.std.FilePropertyBag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonInstantiableFile
  extends Instantiable2[/* fileBits */ js.Array[BlobPart], /* fileName */ String, File]
     with Instantiable3[
      /* fileBits */ js.Array[BlobPart], 
      /* fileName */ String, 
      /* options */ FilePropertyBag, 
      File
    ]

