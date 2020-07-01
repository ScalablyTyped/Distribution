package typings.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The properties for one end of a Line connection.
  */
@js.native
trait SchemaLineConnection extends js.Object {
  /**
    * The object ID of the connected page element.  Some page elements, such as
    * groups, tables, and lines do not have connection sites and therefore
    * cannot be connected to a connector line.
    */
  var connectedObjectId: js.UndefOr[String] = js.native
  /**
    * The index of the connection site on the connected page element.  In most
    * cases, it corresponds to the predefined connection site index from the
    * ECMA-376 standard. More information on those connection sites can be
    * found in the description of the &quot;cnx&quot; attribute in
    * section 20.1.9.9 and Annex H. &quot;Predefined DrawingML Shape and Text
    * Geometries&quot; of &quot;Office Open XML File Formats-Fundamentals and
    * Markup Language Reference&quot;, part 1 of [ECMA-376 5th edition]
    * (http://www.ecma-international.org/publications/standards/Ecma-376.htm).
    * The position of each connection site can also be viewed from Slides
    * editor.
    */
  var connectionSiteIndex: js.UndefOr[Double] = js.native
}

object SchemaLineConnection {
  @scala.inline
  def apply(connectedObjectId: String = null, connectionSiteIndex: js.UndefOr[Double] = js.undefined): SchemaLineConnection = {
    val __obj = js.Dynamic.literal()
    if (connectedObjectId != null) __obj.updateDynamic("connectedObjectId")(connectedObjectId.asInstanceOf[js.Any])
    if (!js.isUndefined(connectionSiteIndex)) __obj.updateDynamic("connectionSiteIndex")(connectionSiteIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaLineConnection]
  }
}

