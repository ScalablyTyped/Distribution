organization := "org.scalablytyped"
name := "hapi__basic"
version := "5.1-dt-20190425Z-92efd8"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "hapi__boom" % "7.4-dt-20190815Z-8ba813",
  "org.scalablytyped" %%% "hapi__catbox" % "10.2-dt-20190521Z-e4d864",
  "org.scalablytyped" %%% "hapi__hapi" % "18.2-dt-20190624Z-7ade47",
  "org.scalablytyped" %%% "hapi__iron" % "5.1-dt-20190404Z-3c07cb",
  "org.scalablytyped" %%% "hapi__joi" % "15.0-dt-20190722Z-93fd12",
  "org.scalablytyped" %%% "hapi__mimos" % "4.1-dt-20190404Z-45ce18",
  "org.scalablytyped" %%% "hapi__podium" % "3.4-dt-20190404Z-40e9d8",
  "org.scalablytyped" %%% "hapi__shot" % "4.1-dt-20190404Z-fec5f8",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20190322Z-05dd4d",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190815Z-2dc4df",
  "org.scalablytyped" %%% "std" % "3.5-cd493c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        