organization := "org.scalablytyped"
name := "hexo"
version := "3.8-dt-20190221Z-7661f9"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20190311Z-9948e1",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-26b345",
  "org.scalablytyped" %%% "hexo-util" % "0.6-dt-20180810Z-dabdbd",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20190322Z-a4867d",
  "org.scalablytyped" %%% "moment" % "2.24.0-11fa43",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190503Z-cb8223",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2",
  "org.scalablytyped" %%% "underscore" % "1.8-dt-20190326Z-42ef2e")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        