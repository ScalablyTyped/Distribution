organization := "org.scalablytyped"
name := "hexo"
version := "3.8-dt-20190221Z-deabc5"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20190311Z-6b9a99",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-039467",
  "org.scalablytyped" %%% "hexo-util" % "0.6-dt-20180810Z-dc6f5d",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20190322Z-7bd4e1",
  "org.scalablytyped" %%% "moment" % "2.24.0-7369bc",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190611Z-b8909f",
  "org.scalablytyped" %%% "std" % "3.5-d4a303",
  "org.scalablytyped" %%% "underscore" % "1.9-dt-20190619Z-a62032")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        