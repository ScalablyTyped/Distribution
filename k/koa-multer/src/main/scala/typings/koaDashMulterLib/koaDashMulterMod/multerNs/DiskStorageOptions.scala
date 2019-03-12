package typings
package koaDashMulterLib.koaDashMulterMod.multerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiskStorageOptions extends js.Object {
  /** A function used to determine within which folder the uploaded files should be stored. Defaults to the system's default temporary directory. */
  var destination: js.UndefOr[
    java.lang.String | (js.Function3[
      /* req */ nodeLib.httpMod.IncomingMessage, 
      /* file */ File, 
      /* callback */ js.Function2[
        /* error */ stdLib.Error | scala.Null, 
        /* destination */ java.lang.String, 
        scala.Unit
      ], 
      scala.Unit
    ])
  ] = js.undefined
  /** A function used to determine what the file should be named inside the folder. Defaults to a random name with no file extension. */
  var filename: js.UndefOr[
    js.Function3[
      /* req */ nodeLib.httpMod.IncomingMessage, 
      /* file */ File, 
      /* callback */ js.Function2[/* error */ stdLib.Error | scala.Null, /* filename */ java.lang.String, scala.Unit], 
      scala.Unit
    ]
  ] = js.undefined
}

object DiskStorageOptions {
  @scala.inline
  def apply(
    destination: java.lang.String | (js.Function3[
      /* req */ nodeLib.httpMod.IncomingMessage, 
      /* file */ File, 
      /* callback */ js.Function2[
        /* error */ stdLib.Error | scala.Null, 
        /* destination */ java.lang.String, 
        scala.Unit
      ], 
      scala.Unit
    ]) = null,
    filename: (/* req */ nodeLib.httpMod.IncomingMessage, /* file */ File, /* callback */ js.Function2[/* error */ stdLib.Error | scala.Null, /* filename */ java.lang.String, scala.Unit]) => scala.Unit = null
  ): DiskStorageOptions = {
    val __obj = js.Dynamic.literal()
    if (destination != null) __obj.updateDynamic("destination")(destination.asInstanceOf[js.Any])
    if (filename != null) __obj.updateDynamic("filename")(js.Any.fromFunction3(filename))
    __obj.asInstanceOf[DiskStorageOptions]
  }
}

