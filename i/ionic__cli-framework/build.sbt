organization := "org.scalablytyped"
name := "ionic__cli-framework"
version := "3.0.0-c72886"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "ionic__utils-object" % "1.0.5-7b238a",
  "org.scalablytyped" %%% "log-update" % "3.3.0-d798fb",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20190322Z-ae0c80",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191101Z-508d7c",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a",
  "org.scalablytyped" %%% "string-width" % "4.1.0-c153b0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        