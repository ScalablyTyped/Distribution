package typings.googleapis.proximitybeaconV1beta1Mod.proximitybeaconV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An attachment namespace defines read and write access for all the
  * attachments created under it. Each namespace is globally unique, and owned
  * by one project which is the only project that can create attachments under
  * it.
  */
@js.native
trait SchemaNamespace extends js.Object {
  /**
    * Resource name of this namespace. Namespaces names have the format:
    * &lt;code&gt;namespaces/&lt;var&gt;namespace&lt;/var&gt;&lt;/code&gt;.
    */
  var namespaceName: js.UndefOr[String] = js.native
  /**
    * Specifies what clients may receive attachments under this namespace via
    * `beaconinfo.getforobserved`.
    */
  var servingVisibility: js.UndefOr[String] = js.native
}

object SchemaNamespace {
  @scala.inline
  def apply(namespaceName: String = null, servingVisibility: String = null): SchemaNamespace = {
    val __obj = js.Dynamic.literal()
    if (namespaceName != null) __obj.updateDynamic("namespaceName")(namespaceName.asInstanceOf[js.Any])
    if (servingVisibility != null) __obj.updateDynamic("servingVisibility")(servingVisibility.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaNamespace]
  }
}

