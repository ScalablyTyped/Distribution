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
  def apply(): SchemaLineConnection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLineConnection]
  }
  @scala.inline
  implicit class SchemaLineConnectionOps[Self <: SchemaLineConnection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setConnectedObjectId(value: String): Self = this.set("connectedObjectId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnectedObjectId: Self = this.set("connectedObjectId", js.undefined)
    @scala.inline
    def setConnectionSiteIndex(value: Double): Self = this.set("connectionSiteIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnectionSiteIndex: Self = this.set("connectionSiteIndex", js.undefined)
  }
  
}

