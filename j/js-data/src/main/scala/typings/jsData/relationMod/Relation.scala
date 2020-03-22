package typings.jsData.relationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("js-data/dist/Relation", "Relation")
@js.native
abstract class Relation protected () extends js.Object {
  def this(relatedMapper: js.Any) = this()
  def this(relatedMapper: js.Any, options: RelationOpts) = this()
  var TYPE_NAME: String = js.native
  var add: js.Any = js.native
  var foreignKey: js.Any = js.native
  var inverse: js.Any = js.native
  val localField: js.Any = js.native
  val localKey: js.Any = js.native
  var mapper: js.Any = js.native
  var name: String = js.native
  var relatedMapper: js.Any = js.native
  var relation: js.Any = js.native
  def _setForeignKey(record: js.Any, relatedRecords: js.Any): Unit = js.native
  def addLinkedRecords(records: js.Any): Unit = js.native
  def assignTo(mapper: js.Any): Unit = js.native
  def canAutoAddLinks(): Boolean = js.native
  def canFindLinkFor(): Boolean = js.native
  def canFindLinkFor(record: js.Any): Boolean = js.native
  def createChildRecord(props: js.Any, relationData: js.Any, opts: js.Any): js.Any = js.native
  def createLinked(props: js.Any, opts: js.Any): js.Any = js.native
  def ensureLinkedDataHasProperType(props: js.Any, opts: js.Any): Unit = js.native
  def findExistingLinksByForeignKey(id: js.Any): js.Any = js.native
  def findExistingLinksFor(record: js.Any*): js.Any = js.native
  def findExistingLinksFor(relatedMapper: js.Any, record: js.Any): js.Any = js.native
  def findInverseRelation(mapper: js.Any): Unit = js.native
  def getForeignKey(record: js.Any): js.Any = js.native
  def getInverse(mapper: js.Any): js.Any = js.native
  def getLocalField(record: js.Any): js.Any = js.native
  def getRelation(): js.Any = js.native
  def isInversedTo(`def`: js.Any): Boolean = js.native
  def isRequiresChildId(): Boolean = js.native
  def isRequiresParentId(): Boolean = js.native
  def linkRecord(record: js.Any, relatedRecord: js.Any): js.Any = js.native
  def relatedCollection(): js.Any = js.native
  def removeLinkedRecords(relatedMapper: js.Any, records: js.Any): Unit = js.native
  def setForeignKey(record: js.Any, relatedRecord: js.Any): Unit = js.native
  def setLocalField(record: js.Any, relatedData: js.Any): Unit = js.native
  def validateOptions(related: js.Any, opts: js.Any): Unit = js.native
}

/* static members */
@JSImport("js-data/dist/Relation", "Relation")
@js.native
object Relation extends js.Object {
  var belongsTo: js.Any = js.native
  var hasMany: js.Any = js.native
  var hasOne: js.Any = js.native
}

