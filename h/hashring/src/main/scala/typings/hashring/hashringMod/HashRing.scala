package typings.hashring.hashringMod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HashRing extends js.Object {
  /**
    * Add a new server to ring without having to re-initialize the hashring.
    * It accepts the same arguments as you can use in the constructor.
    * @param servers Servers that need to be added to the ring.
    */
  def add(servers: Servers): this.type = js.native
  /**
    * Generates the continuum of server a.k.a as the Hash Ring
    * based on their weights and virtual nodes assigned.
    */
  def continuum(): this.type = js.native
  /**
    * Resets the HashRing and closes the ring.
    */
  def end(): this.type = js.native
  /**
    * Find the correct node for which the key is closest to the point
    * after what the given key hashes to.
    * @param key Random key that needs to be searched in the hash ring
    * @returns The matching server address
    */
  def get(key: String): String = js.native
  /**
    * Checks if a given server exists in the hash ring.
    * @param server Server for whose existence we're checking.
    * @returns Indication if we have that server.
    */
  def has(server: String): Boolean = js.native
  /**
    * Returns the points per server.
    * @param servers server Optional server to filter down.
    * @returns server -> Array(points).
    */
  def points(servers: Servers): js.Array[Record[String, Double]] = js.native
  /**
    * Returns a range of servers. Could be useful for replication.
    * @param key Random key that needs to be searched in the hash ring
    * @param size Amount items to be returned (maximum).
    *        Defaults to the amount of servers that are in the hashring.
    * @param unique Don't return duplicate servers. Defaults to true.
    */
  def range(key: String): js.Array[String] = js.native
  def range(key: String, size: Double): js.Array[String] = js.native
  def range(key: String, size: Double, unique: Boolean): js.Array[String] = js.native
  /**
    * Remove a server from the hash ring.
    * @param server Server that need to be removed from the ring.
    */
  def remove(server: Servers): this.type = js.native
  /**
    * Reset the HashRing and clean up it's references.
    */
  def reset(): this.type = js.native
  /**
    * Hotswap identical servers with each other.
    * This doesn't require the cache to be completely nuked and
    * the hash ring distribution to be re-calculated.
    * @param from The server that needs to be replaced
    * @param to The server that replaces the server
    */
  def swap(from: String, to: String): this.type = js.native
}

