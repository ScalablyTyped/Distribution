package typings
package jsonldLib.jsonldMod.OptionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocLoader extends js.Object {
  var documentLoader: js.UndefOr[
    js.Function2[
      /* url */ jsonldLib.jsonldDashSpecMod.Url, 
      /* callback */ js.Function2[
        /* err */ stdLib.Error, 
        /* remoteDoc */ jsonldLib.jsonldDashSpecMod.RemoteDocument, 
        scala.Unit
      ], 
      js.Promise[jsonldLib.jsonldDashSpecMod.RemoteDocument]
    ]
  ] = js.undefined
}

object DocLoader {
  @scala.inline
  def apply(
    documentLoader: (/* url */ jsonldLib.jsonldDashSpecMod.Url, /* callback */ js.Function2[
      /* err */ stdLib.Error, 
      /* remoteDoc */ jsonldLib.jsonldDashSpecMod.RemoteDocument, 
      scala.Unit
    ]) => js.Promise[jsonldLib.jsonldDashSpecMod.RemoteDocument] = null
  ): DocLoader = {
    val __obj = js.Dynamic.literal()
    if (documentLoader != null) __obj.updateDynamic("documentLoader")(js.Any.fromFunction2(documentLoader))
    __obj.asInstanceOf[DocLoader]
  }
}

