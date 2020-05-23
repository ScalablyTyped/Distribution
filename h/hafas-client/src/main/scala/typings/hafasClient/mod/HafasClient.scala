package typings.hafasClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HafasClient extends js.Object {
  def arrivals(station: String): js.Promise[js.Array[Alternative]] = js.native
  def arrivals(station: String, options: DeparturesArrivalsOptions): js.Promise[js.Array[Alternative]] = js.native
  def arrivals(station: Station): js.Promise[js.Array[Alternative]] = js.native
  def arrivals(station: Station, options: DeparturesArrivalsOptions): js.Promise[js.Array[Alternative]] = js.native
  def departures(station: String): js.Promise[js.Array[Alternative]] = js.native
  def departures(station: String, options: DeparturesArrivalsOptions): js.Promise[js.Array[Alternative]] = js.native
  def departures(station: Station): js.Promise[js.Array[Alternative]] = js.native
  def departures(station: Station, options: DeparturesArrivalsOptions): js.Promise[js.Array[Alternative]] = js.native
  def journeys(from: String, to: String): js.Promise[Journeys] = js.native
  def journeys(from: String, to: String, options: JourneysOptions): js.Promise[Journeys] = js.native
  def journeys(from: String, to: Location): js.Promise[Journeys] = js.native
  def journeys(from: String, to: Location, options: JourneysOptions): js.Promise[Journeys] = js.native
  def journeys(from: String, to: Station): js.Promise[Journeys] = js.native
  def journeys(from: String, to: Station, options: JourneysOptions): js.Promise[Journeys] = js.native
  def journeys(from: Location, to: String): js.Promise[Journeys] = js.native
  def journeys(from: Location, to: String, options: JourneysOptions): js.Promise[Journeys] = js.native
  def journeys(from: Location, to: Location): js.Promise[Journeys] = js.native
  def journeys(from: Location, to: Location, options: JourneysOptions): js.Promise[Journeys] = js.native
  def journeys(from: Location, to: Station): js.Promise[Journeys] = js.native
  def journeys(from: Location, to: Station, options: JourneysOptions): js.Promise[Journeys] = js.native
  def journeys(from: Station, to: String): js.Promise[Journeys] = js.native
  def journeys(from: Station, to: String, options: JourneysOptions): js.Promise[Journeys] = js.native
  def journeys(from: Station, to: Location): js.Promise[Journeys] = js.native
  def journeys(from: Station, to: Location, options: JourneysOptions): js.Promise[Journeys] = js.native
  def journeys(from: Station, to: Station): js.Promise[Journeys] = js.native
  def journeys(from: Station, to: Station, options: JourneysOptions): js.Promise[Journeys] = js.native
  def locations(from: String): js.Promise[js.Array[Station | Stop | Location]] = js.native
  def locations(from: String, options: LocationsOptions): js.Promise[js.Array[Station | Stop | Location]] = js.native
  def nearBy(location: Location): js.Promise[Stop] = js.native
  def nearBy(location: Location, options: NearByOptions): js.Promise[Stop] = js.native
  def reachableFrom(address: Location): js.Promise[js.Array[Duration]] = js.native
  def reachableFrom(address: Location, options: ReachableFromOptions): js.Promise[js.Array[Duration]] = js.native
  def refreshJourney(refreshToken: String): js.Promise[Journey] = js.native
  def refreshJourney(refreshToken: String, options: RefreshJourneyOptions): js.Promise[Journey] = js.native
  def stop(id: String): js.Promise[Stop] = js.native
  def stop(id: String, options: StopOptions): js.Promise[Stop] = js.native
  def trip(id: String, name: String): js.Promise[Trip] = js.native
  def trip(id: String, name: String, options: TripOptions): js.Promise[Trip] = js.native
}

