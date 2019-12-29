package typings.lucene.luceneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.lucene.luceneStrings.LessthansignimplicitGreaterthansign
  - typings.lucene.luceneStrings.NOT
  - typings.lucene.luceneStrings.OR
  - typings.lucene.luceneStrings.AND
  - typings.lucene.luceneStrings.`AND NOT`
  - typings.lucene.luceneStrings.`OR NOT`
*/
trait Operator extends js.Object

object Operator {
  @scala.inline
  def AND: typings.lucene.luceneStrings.AND = this.cast("AND")
  @scala.inline
  def `AND NOT`: typings.lucene.luceneStrings.`AND NOT` = this.cast("AND NOT")
  @scala.inline
  def LessthansignimplicitGreaterthansign: typings.lucene.luceneStrings.LessthansignimplicitGreaterthansign = this.cast("<implicit>")
  @scala.inline
  def NOT: typings.lucene.luceneStrings.NOT = this.cast("NOT")
  @scala.inline
  def OR: typings.lucene.luceneStrings.OR = this.cast("OR")
  @scala.inline
  def `OR NOT`: typings.lucene.luceneStrings.`OR NOT` = this.cast("OR NOT")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

