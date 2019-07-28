package typings.keyv

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object keyvStrings {
  @js.native
  sealed trait mongo extends js.Object
  
  @js.native
  sealed trait mongodb extends js.Object
  
  @js.native
  sealed trait mysql extends js.Object
  
  @js.native
  sealed trait postgres extends js.Object
  
  @js.native
  sealed trait postgresql extends js.Object
  
  @js.native
  sealed trait redis extends js.Object
  
  @js.native
  sealed trait sqlite extends js.Object
  
  @scala.inline
  def mongo: mongo = "mongo".asInstanceOf[mongo]
  @scala.inline
  def mongodb: mongodb = "mongodb".asInstanceOf[mongodb]
  @scala.inline
  def mysql: mysql = "mysql".asInstanceOf[mysql]
  @scala.inline
  def postgres: postgres = "postgres".asInstanceOf[postgres]
  @scala.inline
  def postgresql: postgresql = "postgresql".asInstanceOf[postgresql]
  @scala.inline
  def redis: redis = "redis".asInstanceOf[redis]
  @scala.inline
  def sqlite: sqlite = "sqlite".asInstanceOf[sqlite]
}

