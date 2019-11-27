organization := "org.scalablytyped"
name := "libnpmsearch"
version := "2.0-dt-20190926Z-752427"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191126Z-08e889",
  "org.scalablytyped" %%% "node-fetch" % "2.5-dt-20191126Z-8331c3",
  "org.scalablytyped" %%% "npm-package-arg" % "6.1-dt-20181031Z-05808f",
  "org.scalablytyped" %%% "npm-registry-fetch" % "4.0-dt-20190925Z-28835e",
  "org.scalablytyped" %%% "npmlog" % "4.1-dt-20190626Z-75b626",
  "org.scalablytyped" %%% "ssri" % "6.0-dt-20190422Z-2ef31b",
  "org.scalablytyped" %%% "std" % "3.7-1d724d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        